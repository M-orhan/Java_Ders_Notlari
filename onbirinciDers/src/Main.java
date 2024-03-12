public class Main {
    public static void main(String[] args) {

          baglanti baglantiObj=new baglanti();
          /*int sonuc=baglantiObj.personelEkle("45443234242", Short.parseShort("22234"),"Ali Can","06.08.1988",true,"muhendis",false);

          if(sonuc==1)
              System.out.println("Kayıt Eklendi");
          else
              System.out.println("Hata oluştu");*/

          int sonuc=baglantiObj.personelSil("31212");
          if(sonuc>0)
              System.out.println("Silinen kayıt sayısı : " + sonuc);
          else
              System.out.println("Kayıt silinemedi.");


          baglantiObj.baglantiyiKapat();
    }
}