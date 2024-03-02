import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          /*Kullanici kullanici1=new Kullanici();
          kullanici1.setIsim("Hüseyin Bodur");

          kullanici1.setNumara(4);
          kullanici1.setYas(20);

          System.out.println("Kullanıcının adı :" + kullanici1.getIsim());
          System.out.println("Kullanıcının yaşı : " + kullanici1.getYas());
          System.out.println("Kullanıcının numarası : " + kullanici1.getNumara());*/

          OgretimUyesi ogretimUyesi1=new OgretimUyesi();
          ogretimUyesi1.sicilNo=1234;
          ogretimUyesi1.adiSoyadi="Hüseyin Bodur";
          System.out.println(ogretimUyesi1.sicilNo+ " numaralı personel" + ogretimUyesi1.adiSoyadi+ " nın maaşı " + ogretimUyesi1.maasHesapla(2,10) +" TL'dir");
          //System.out.println(ogretimUyesi1.adiSoyadi);

          Memur memurObj=new Memur();
          System.out.println(memurObj.maasHesapla(4,40));



    }
}