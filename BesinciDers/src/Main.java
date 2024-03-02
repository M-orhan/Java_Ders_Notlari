import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Main mainNesne=new Main();
        double toplamTutar= mainNesne.kdvliUrunFiyatiBul("Mobilya",2500);
        double toplamTutar2=mainNesne.kdvliUrunFiyatiBul2("Gıda",250);
        System.out.println(toplamTutar);
        System.out.println(toplamTutar2);*/

        //kdvliUrunFiyatiBul("Mobilya",1500);
        //System.out.println("Kdv dahil ürün fiyatı : " + kdvliUrunFiyatiBul("Mobilya",2500));

        /*List genericDegil=new ArrayList();
        genericDegil.add("merhaba");
        genericDegil.add(2);
        genericDegil.add(false);

        String sonuc;
        for(int i=0;i<genericDegil.size();i++)
            sonuc=(String) genericDegil.get(i);

        List<String> generic=new ArrayList();
        generic.add("merhaba");
        generic.add(3);*/

        //GENERIC YAPISI
        /*Ogrenciler<Integer>notlar=new Ogrenciler<>();
        notlar.listeyeEkle(90);
        notlar.listeyeEkle(34);
        notlar.listeyeEkle(75);

        Ogrenciler<String>ogrenciAdlari=new Ogrenciler<>();
        ogrenciAdlari.listeyeEkle("Mehmet");
        ogrenciAdlari.listeyeEkle("Mert");
        ogrenciAdlari.listeyeEkle("Ahmet");

        Calisanlar <Integer> isci=new Calisanlar<>();
        isci.ad="Ahmet";
        isci.Soyad="Bodur";
        isci.maas=4000;

        Calisanlar <Double> muhendis=new Calisanlar<>();
        isci.ad="Mehmet";
        isci.Soyad="Veli";
        isci.maas=4000;*/

        //MATH SINIFI
        double sonuc;

        sonuc=Math.pow(2,4);
        System.out.println("Sonuç: " +sonuc);

        sonuc=Math.sqrt(16);
        System.out.println("Sonuç: " + sonuc);

        sonuc=Math.ceil(2.56);
        System.out.println("Sonuç: " + sonuc);

        sonuc=Math.floor(2.56);
        System.out.println("Sonuç: " + sonuc);

        sonuc=Math.max(5,3);
        System.out.println("Sonuç: " + sonuc);

        sonuc=Math.min(5,3);
        System.out.println("Sonuç: " + sonuc);

        sonuc=(Math.random()*100);
        int sonuc2=(int)Math.round(sonuc);  //RANDOM KOMUTUNDAN GELEN KÜSÜRATLI DEĞERİ TAM SAYIYA ÇEVİRME
        System.out.println("Sonuç: " + sonuc2);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.TAU);

        System.out.println(Matematik.TAU);

        System.out.println(Matematik.GoldenRate(55,34));












        }
    double kdvliUrunFiyatiBul(String urunTuru,double urunFiyati)
    {
        double kdvOrani,kdvTutar,toplamTutar=0;

        if(urunTuru.equals("Mobilya"))
        {
            kdvOrani=0.08;
            kdvTutar=urunFiyati*kdvOrani;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else if(urunTuru.equals("Beyaz Eşya"))
        {
            kdvOrani=0.18;
            kdvTutar=urunFiyati*kdvOrani;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else if(urunTuru.equals("Gıda"))
        {
            kdvOrani=0.2;
            kdvTutar=urunFiyati*kdvOrani;
            toplamTutar=urunFiyati+kdvTutar;
        }
        else
        {
            kdvOrani=0.18;
            kdvTutar=urunFiyati*kdvOrani;
        }
        return toplamTutar;
    }

    double kdvliUrunFiyatiBul2(String urunTuru,double urunFiyati)
    {
        double kdvOrani,kdvTutar,toplamTutar=0;

        if(urunTuru.equals("Mobilya"))
            kdvOrani=0.08;
        else if(urunTuru.equals("Beyaz Eşya"))
            kdvOrani=0.18;
        else if(urunTuru.equals("Gıda"))
            kdvOrani=0.2;
        else
            kdvOrani=0.12;


        return urunFiyati+(urunFiyati*kdvOrani);
    }


    }
