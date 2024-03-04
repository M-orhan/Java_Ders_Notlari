public class Main {
    public static void main(String[] args) {
         kamyon bmc=new kamyon();
         bmc.hizGoster(80);
         bmc.yolcuKapasitesi(3);
         bmc.yolculukTuru();
         bmc.motorHacmi("cc");
         bmc.yakitTuru("Mazot");

         System.out.println();
         ucak boeing=new ucak();
         boeing.hizGoster(700);
         boeing.yolcuKapasitesi(250);
         boeing.yolculukTuru();
         boeing.kanatAcikligi(200);
         boeing.ucusMenzili(10000);


         System.out.println();
         gemi cruise=new gemi();
         cruise.hizGoster(120);
         cruise.yolcuKapasitesi(500);
         cruise.yolculukTuru();
         cruise.kamaraSayisi(200);
         cruise.sevkSistemi("motorlu pervaneli");
         cruise.kullanimTuru("Turistik");

         yuruyenUcak yuruyenUcakObj=new yuruyenUcak();
         yuruyenUcakObj.yolDurum();


         /*Hayvan hayvanObj=new Hayvan();
         Kus kusObj=new Kus();
         Yilan yilanObj=new Yilan();
         Balik balikObj=new Balik();

        eylemGerceklestir(hayvanObj);
        eylemGerceklestir(kusObj);
        eylemGerceklestir(yilanObj);
        eylemGerceklestir(balikObj);*/



    }

    /*static void eylemGerceklestir(Object nesne)    //instanceof kodu ile derleme sırasında nesneleri tanımlayabiliriz.
    {
        if(nesne instanceof Balik){
            Balik balikObj=new Balik();
            balikObj.eylem();
        }
    }*/

    static void eylemGerceklestir(Hayvan hayvanTipindeParametre)
    {
        hayvanTipindeParametre.eylem();
    }
}

//Normal Sınıf= Gövdeli metotlar bulunur, Nesnesi oluşturulabilir. Public,private,protected erişim belirteçleri kullanılabilir.
//Soyut Sınıf= Gövdeli ve gövdesiz metotlar bulunur, Nesnesi oluşturulamaz, 100 tane gövdeli metodun olsa bile bir tane gövdesiz method tanımlayacaksan o sınıf soyut(abstract) tanımlamak zorundadır. Public,private,protected erişim belirteçleri kullanılabilir.
//Arayüzler = Yalnızca gövdesiz metotlar tanımlanır, Sadece public tanımlaması yapılabilir, Nesnesi oluşturulamaz. Bir üst sınıf yalnızca bir üst sınıfa bağlanabilirken, birden fazla arayüzden özelliklik alabilir.