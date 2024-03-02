import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
             /*int sayi=5;
             int usDeger=3;
             int sonuc=1;

             while(usDeger!=0){
                 sonuc=sonuc*sayi;
                 usDeger-=1;}
             System.out.println(sonuc);
             System.out.println(usHesaplama(6,3));*/

             //OBEB VE OKEK//
             /*int sayi1=21;
             int sayi2=14;*/
             /*int obeb=1,okek;

             for(int i=1;i<=sayi1 && i<=sayi2;i++)
             {
                 if(sayi1%i==0 && sayi2%i==0)
                     obeb=i;
             }

             okek=(sayi1*sayi2)/obeb;
             System.out.println(sayi1+" ve "+sayi2+" sayılarının en büyük ortak böleni : "+obeb);
             System.out.println(sayi1+" ve "+sayi2+" sayılarının en küçük ortak böleni : "+okek);*/

             /*System.out.println(sayi1+" ve "+sayi2+" sayılarının en büyük ortak böleni : "+obebHesaplama(sayi1,sayi2));
             System.out.println((" Sayılarının en küçük ortak böleni : ") + sayi1*sayi2/obebHesaplama(sayi1,sayi2));*/

        /*String mesaj="Merhaba Dünya";
        for(int i=0;i<100;i++)
        {
            System.out.println(mesaj);
        }*/
        //KULLANICIDAN ALINAN VERİ//
        /*int[] Adizisi=new int[10];
        int[] Bdizisi=new int[10];
        Scanner okunanVeri;
        char secim;
        okunanVeri=new Scanner(System.in);
        System.out.print("Bir dizi seçiniz {A-B}");
        secim=okunanVeri.next().toUpperCase().charAt(0);
        okunanVeri.close();*/

        /*for(int i=0;i<10;i++)
        {
            if(secim=='A')
                Adizisi[i]=i+1;
            else if(secim=='B')
               Bdizisi[i]=i+3;
            else
            {
                System.out.println("Hatalı Seçim");
                break;
            }
        }*/

        /*if(secim=='A')
        {
            for(int i=0; i<10;i++)
                Adizisi[i]=i+1;
        }
        else if(secim='B'){
            for(int i=0;i<10;i++)
                Bdizisi[i]=i+3;
        }
        else
            System.out.println("Hatalı Seçim");*/

        /*int tekToplam=0,ciftToplam=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
                ciftToplam+=i;
            else
                tekToplam+=i;
        }
        System.out.println("Döngüdeki Tek Sayıların Toplamı : " + tekToplam);
        System.out.println("Döngüdeki Çift Sayıların Toplamı : " + ciftToplam);*/




        //DİZİLER//
        /*int [] sayilar={1,2,3,4,5,};
        int[] sayilar2=new int[5];
        sayilar2[0]=1;
        sayilar2[1]=2;
        sayilar2[2]=3;
        sayilar2[3]=4;
        sayilar2[4]=5;

        String[] sehirler={"Düzce","Bolu","Sakarya"};

        char[] alfabe=new char[4];
        alfabe[0]='a';
        alfabe[1]='b';
        alfabe[2]='c';

        int[] sayilarBunlar = {45,67,12,1,3,89,13,56,8};
        int[] siralanmisSayilar=sayilariSirala(sayilarBunlar);

        for(int i=0;i<siralanmisSayilar.length;i++)
            System.out.print(siralanmisSayilar[i]+" ");*/

        }



        //RECURSİVE US HESAPLAMA//
        static int usHesaplama(int sayi, int usDeger)
        {
        if(usDeger==0||sayi==1)
            return 1;
        else
            return sayi*usHesaplama(sayi,usDeger-1);
        }


        //RECURSİVE OBEB HESAPLAMA//
        static int obebHesaplama(int sayi1,int sayi2){
        if(sayi2==0)
            return sayi1;
        else
            return obebHesaplama(sayi2,sayi1%sayi2);
        }


         static int[] sayilariSirala(int[] sayilar)
         {
           int gecici;
           int sayac=0;
           for(int i=0; i<sayilar.length-1;i++)
           {
               for(int j=i+1;j<sayilar.length;j++)
                   if(sayilar[j]<sayilar[i]){
                       gecici=sayilar[i];
                       sayilar[i]=sayilar[j];
                       sayilar[j]=gecici;
                   }
               sayac++;
           }
           return sayilar;
         }
    }
