import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main mainNesnesi = new Main();
        //System.out.println(mainNesnesi.dosyaVarMi("deneme.txt"));

        //mainNesnesi.dosyayaYazdir("E:\\mesaj.txt","hello world");

        //mainNesnesi.dosyayaYazdir2("deneme.txt","hello world");

        //mainNesnesi.dosyadanOku2("deneme.txt");
        //mainNesnesi.dosyadanOku("E:\\mesaj.txt");
        mainNesnesi.dosyaOlustur("E\\mesaj2.txt");

    }

    boolean dosyaVarMi(String path) {
        File dosya = new File(path);
        if (dosya.exists())
            return true;
        else
            return false;
    }

    boolean dosyaOlustur(String path) {
        if (!dosyaVarMi(path)) {
            File dosya = new File(path);
            try {
                dosya.createNewFile();
            }
            catch (IOException e) {}
        }
        return false;
    }

        void dosyayiSil(String path){
            if (dosyaVarMi(path)) {
                File dosya = new File(path);
                dosya.delete();
            }
        }


        void dosyadanOku(String path){
            if (dosyaVarMi(path)) {
                try {
                    FileReader okumaNesnesi = new FileReader(path);
                    BufferedReader bufferNesnesi = new BufferedReader(okumaNesnesi);

                    String satir;
                    while ((satir = bufferNesnesi.readLine()) != null)
                        System.out.println(satir);

                    bufferNesnesi.close();
                    okumaNesnesi.close();
                } catch (IOException e) {
                }
            } else
                System.out.println("Dosya Yok.");
        }

        void dosyayaYazdir2(String path, String yazdirilacakVeri){
            byte[] verininByteHali = yazdirilacakVeri.getBytes();
            try {
                FileOutputStream fileOutputNesnesi = new FileOutputStream(path);
                BufferedOutputStream bufferNesnesi = new BufferedOutputStream(fileOutputNesnesi);
                bufferNesnesi.write(verininByteHali);
                bufferNesnesi.write("\n".getBytes());
                bufferNesnesi.close();
                fileOutputNesnesi.close();
            } catch (IOException e) {
            }

        }


        void dosyadanOku2(String path){
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
        }

        void dosyayaYazdir(String path,String yazdirilacakVeri){
            try {
                FileWriter dosyayaYazdirObj = new FileWriter(path, true);
                dosyayaYazdirObj.write(yazdirilacakVeri + "\n");
                dosyayaYazdirObj.close();
            } catch (IOException e) {
            }
        }
    }

