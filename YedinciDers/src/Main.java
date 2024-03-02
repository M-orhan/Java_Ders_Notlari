public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenciNesnesi=new Ogrenci();
        Daire daireNesnesi=new Daire();
        Memur memurNesnesi=new Memur();
        Personel personelNesnesi=new Personel();
        Iphone14 iphoneObj=new Iphone14();
        Nokia3310 nokiaObj=new Nokia3310();

        iphoneObj.AramaYapma("05448885566");
        iphoneObj.MesajAtma("0532444885522","Merhaba");

        System.out.println();
        System.out.println();

        nokiaObj = new Nokia3310();
        nokiaObj.AramaYapma("05442235544");
        nokiaObj.MesajAtma("0544777889966","Selam");
        iphoneObj.interneteBaglan("google.com");
        iphoneObj.Oyunlar("3d");
        nokiaObj.ZilSesi();
        nokiaObj.takozOzelligi();




        /*OgretimUyesi ogretimUyesiNesnesi=new OgretimUyesi();

        System.out.println(daireNesnesi.alanHesapla());

        daireNesnesi=new Daire(5);
        System.out.println(daireNesnesi.alanHesapla());

        daireNesnesi=new Daire(4,3.14);
        System.out.println(daireNesnesi.alanHesapla());

        ogrenciNesnesi.setOgrenciNot(90);
        System.out.println(ogrenciNesnesi.getOgrenciNot());

        //memurNesnesi.maasHesapla(1,45,500);
        System.out.println(memurNesnesi.maasHesapla(1,45,500));
        System.out.println(ogretimUyesiNesnesi.maasHesapla(3,40,600));
        System.out.println(personelNesnesi.maasHesapla(2,45,550));

        System.out.println(memurNesnesi.sicilNo=100);*/

        /*private DegiskenTipi degisken;
        public void birMetotKimleriCagirailir(parametreTipi parametre){
            ayniSinifIcindeBulunanBaskaBirMetot();
            degisken.metotlari();
            parametre.metotlari();

            BirDigerNesneTipi birDigerNesne=new BirDigerNesneTipi();
            birDigerNesne.metotlari();
        }*/





    }
}