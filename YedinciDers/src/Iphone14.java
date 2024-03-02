public class Iphone14 extends CepTelefonu{

    Iphone14(){
        System.out.println("Iphone 14 Sınıfı Yapılandırıcısı");
    }

    @Override
    void Oyunlar(String oyunTuru) {
        System.out.println(oyunTuru + " oyun oynanabilir");
    }

    @Override
    void ZilSesi() {
        System.out.println("Her ses dosyası tipinde zil sesi " + "kullanılabilir");
    }

    void interneteBaglan(String internetAdresi){
        System.out.println("Bağlanılan"+"site"+internetAdresi);
    }
}
