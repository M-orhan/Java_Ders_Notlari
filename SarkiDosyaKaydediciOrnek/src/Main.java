import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main mainNesnesi=new Main();
        mainNesnesi.dosyaVarMi("\"C:\\Users\\burak\\IdeaProjects\\SarkiDosyaKaydediciOrnek\\sarkilar.txt\"");
        System.out.println(mainNesnesi.dosyaVarMi("sarkilar.txt"));

        mainNesnesi.dosyayaYazdir("\"C:\\Users\\burak\\IdeaProjects\\SarkiDosyaKaydediciOrnek\\sarkilar.txt\"","bbbb");

    }

    boolean dosyaVarMi(String path) {
        File dosya = new File(path);

        if (dosya.exists())
            return true;
        else
            return false;
    }

    void dosyayaYazdir(String path,String yazdirilacakVeri){
        try {
            List<String> satirlar = new ArrayList<>();
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                satirlar.add(satir);
            }
            bufferedReader.close();
            if (satirlar.contains(yazdirilacakVeri)) {
                System.out.println("Uyarı: Kaydetmek istediğiniz dosyanın ismi mevcut.");
                return;
            }
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write(yazdirilacakVeri + "\n");
            fileWriter.close();
            System.out.println("Dosya başarıyla kaydedildi.");
            System.out.println(dosyadanOku2("C:/Users/burak/IdeaProjects/SarkiDosyaKaydediciOrnek/sarkilar.txt"));

        } catch (IOException e) {}
    }

    boolean dosyadanOku2(String path){
        if (dosyaVarMi(path)) {
            try {
                File dosyam = new File(path);
                byte[] gelenByteVeriler = new byte[(int) dosyam.length()];

                FileInputStream fileInputNesnesi = new FileInputStream(path);
                BufferedInputStream bufferInputNesnesi = new BufferedInputStream(fileInputNesnesi);

                bufferInputNesnesi.read(gelenByteVeriler, 0, gelenByteVeriler.length);

                bufferInputNesnesi.close();
                fileInputNesnesi.close();
                String sonuc = new String(gelenByteVeriler, StandardCharsets.UTF_8);
                System.out.println(sonuc);
            } catch (IOException e) {
            }
        } else
            System.out.println("Dosya yok");
        return false;
    }


}





