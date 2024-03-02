public class Nokia3310 extends CepTelefonu {

    Nokia3310(){
        System.out.println("Nokia3310 sınıfı yapılandırıcı");
    }

    @Override
    void Oyunlar(String oyunTuru) {
        System.out.println(oyunTuru + "Sadece iki boyutlu oyunlar oynanır.");;
    }

    @Override
    void ZilSesi() {

    }

    void takozOzelligi(){
        System.out.println("Dilerseniz "+"arabanızın kaymaması için "+"takoz olarak kullanabilirsiniz");
    }
}
