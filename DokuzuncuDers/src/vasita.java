public abstract class vasita
{
    void hizGoster(int hiz){
        System.out.println("Saatteki hız: "+ hiz);
    }

    void yolcuKapasitesi(int yolcuSayisi){
        System.out.println("Yolcukapasitesi: " + yolcuSayisi);
    }

    abstract void yolculukTuru();
}
