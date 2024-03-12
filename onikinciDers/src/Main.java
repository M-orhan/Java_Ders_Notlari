import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        baglanti baglantiObj=new baglanti();
        //PERSONEL EKLEME
          /*int sonuc=baglantiObj.personelEkle("45443234242", Short.parseShort("31212"),"Ali Can","06.08.1988",true,"muhendis",false);

          if(sonuc==1)
              System.out.println("Kayıt Eklendi");
          else
              System.out.println("Hata oluştu");*/

        /*int sonuc=baglantiObj.personelSil("31212");
        if(sonuc>0)
            System.out.println("Silinen kayıt sayısı : " + sonuc);
        else
            System.out.println("Kayıt silinemedi.");*/

        //PERSONEL GÜNCELLEME
        int sonuc=baglantiObj.personelGuncelle("111555444", (short)12345, "Hasan Yılmaz", "11.33.2200", true, "isci", false);
        if(sonuc>0)
            System.out.println("Kayıt Güncellendi. ");
        else
            System.out.println("Kayıt Güncellenmedi.");

        //SQL VERİTABANINDA Kİ VERİLERİ EKRANA YAZDIRMA
        ArrayList<String>okunanlar=baglantiObj.personelOku();
        baglantiObj.baglantiyiKapat();

        for(int i=0;i<okunanlar.size();i++)
            System.out.println(okunanlar.get(i));


    }
}