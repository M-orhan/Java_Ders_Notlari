public class OgretimUyesi extends Personel{
    double vergiOrani=0.27;
    OgretimUyesi(){

        //super();  //üst sınıftan özellik alınması için girilen kod

        System.out.println("Öğretim üyesi yapılandırıcısı");

        //System.out.println(super.vergiOrani);  //super anahtar kelimesi ile üst sınıfın değişkenini alıyoruz

        //System.out.println(this.vergiOrani);  //this anahtar kelimesi ile bu sınıfa ait değişkeni alıyoruz

    }

    void dersIsleri(){
        System.out.println("Ders işleri burada"+" tanımlanır");
    }

}
