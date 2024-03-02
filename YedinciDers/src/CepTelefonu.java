public abstract class CepTelefonu {
    String telefonNumarasi,mesaj;
    CepTelefonu(){
        System.out.println("Cep Telefonu Sınıfı Yapılandırıcı");
    }

    void AramaYapma(String telefonNumarasi){
          this.telefonNumarasi=telefonNumarasi;
          System.out.println(telefonNumarasi + " aranıyor");
    }

    void MesajAtma(String telefonNumarasi,String mesaj){
        this.telefonNumarasi=telefonNumarasi;
        this.mesaj=mesaj;
        System.out.println(telefonNumarasi + " na gönderilen mesaj: " + mesaj);
    }


    abstract void Oyunlar(String oyunTuru);
    abstract void ZilSesi();         //Bir sınıf abstract ise gövdeli ve normal metot olarak tanımlanabilir
                                     //Bir sınıf içerisinde abstract metot varsa, sınıf abstract olarak tanımlanmalıdır.
                                     //Normal bir sınıf içerisinde gövdeli metotlar bulunurken,abstract sınıf içerisinde gövdeli ve normal metotlar bulunur.

}
