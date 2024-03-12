import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        //Hata yönetimi
        //Throwable altında hatalar ikiye ayrılır; Error ve Exception. Exception altında IOException,Nullpoint,IndexOutOfBounds vb

        //Çalışma zamanı istisnası
        try {
            int sayilar[] = {1, 2, 3, 4};
            for (int i = 0; i < 10; i++)
                System.out.println(sayilar[i]);
        }
        catch(ArrayIndexOutOfBoundsException diziTasmaHatasi)
        {
            System.out.println(diziTasmaHatasi.toString());
        }

        //Çalışma zamanı istisnası-Örnek 2

        Scanner giris=new Scanner(System.in);
        int bolum=45;
        int bolen=0;
        System.out.print("Bölümü girin : ");
        bolum= giris.nextInt();
        System.out.print("Böleni girin : ");
        bolum= giris.nextInt();
        try {
            System.out.println(bolum / bolen);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }

        //Derleme zamanı istisnası

        /*try {
            File dosya = new File("deneme.txt");
            FileWriter yazmaObj = new FileWriter((dosya));
            yazmaObj.write("Merhaba Dünya");
            //yazmaObj.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        finally {
            try {
                yazmaObj.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }*/

        try {
            dosyayaYazdir();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void dosyayaYazdir() throws IOException
    {
        dosyayaYazdir2();
    }

    static void dosyayaYazdir2() throws IOException
    {
        File dosya=new File("deneme.txt");
        FileWriter dosyayaYazObj=new FileWriter(dosya);
        dosyayaYazObj.write("selam");
        dosyayaYazObj.close();
    }
}