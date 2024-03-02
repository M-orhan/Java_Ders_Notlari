//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void carp(int sayi1, int sayi2) {
        System.out.println("Sayıların carpımı = " + (sayi1 * sayi2));
    }
    public static void main(String[] args) {

        //ARİTMETİK OPERATÖRLER
		/*int sayi1=100;
		int sayi2=20;
		int sonuc;

		sonuc=sayi1+sayi2;
		System.out.println("Toplama Sonuç :  " + sonuc);

		sonuc=sayi1-sayi2;
		System.out.println("Çıkarma Sonuç : " + sonuc);

		sonuc=sayi1*sayi2;
		System.out.println("Çarpma Sonuç : " + sonuc);

		sonuc=sayi1/sayi2;
		System.out.println("Bölme Sonuç : " + sonuc);

		sonuc=sayi1%sayi2;
		System.out.println("Mod Sonuç : " + sonuc);*/

        //TEKİL OPERATÖRLER
		/*int sayi3=5;
		int sayi4=10;
		int sonuc;

		sonuc=++sayi3 - sayi4--;
		System.out.println("Sayı3 : " + sayi3);
		System.out.println("Sayı4 : " + sayi4);
		System.out.println("Sonuç : " + sonuc);*/

        //ÖRNEK 2
		/*int sayi3=5;
		int sayi4=10;
		int sonuc1,sonuc2;

		sonuc1=++sayi3-sayi4--;
		sonuc2=++sayi3 - -sayi4;
		System.out.println("Sayı3 : " + sayi3);
		System.out.println("Sayı4 : " + sayi4);
		System.out.println("Sonuç1 : " + sonuc1);
		System.out.println("Sonuç2 : " + sonuc2);*/

        //İLİŞKİSEL OPERATÖRLER
		/*int sayi5=30;
		int sayi6=35;

		System.out.println("Sayılar eşit mi ? " + (sayi5==sayi6));
		System.out.println("Sayılar eşit değil mi ? " + (sayi5!=sayi6));
		System.out.println("Sayı5,Sayı6'dan büyük mü ? " + (sayi5>sayi6));
		System.out.println("Sayı5,Sayı6'dan küçük mü ? " + (sayi5<sayi6));
		System.out.println("Sayı5,Sayı6'dan küçük eşit mi ? " + (sayi5<=sayi6));
		System.out.println("Sayı5,Sayı6'dan büyük eşit mi ? " + (sayi5>=sayi6));*/

        //MANTIKSAL OPERATÖRLER
		/*int sayi7=27;
		int sayi8=12;
		System.out.println(sayi7==27 && sayi8<sayi7);
		System.out.println(sayi8==12 && sayi7<sayi8);
		System.out.println(sayi8==12 || sayi7<sayi8);
		System.out.println(!(sayi7==26));*/

        //BİTSEL OPERATÖRLER
		/*int sayi9=4;
		int sayi10=7;

		System.out.println(sayi9 & sayi10);
		System.out.println(sayi9 | sayi10);
		System.out.println(sayi9^sayi10);
		System.out.println(sayi10>>2);
		System.out.println(sayi10<<2);*/

		/*int tekToplam=0,ciftToplam=0;
		for(int i=1; i<=100;i+=2)
		{
			tekToplam+=i;
			ciftToplam+=i+1;
		}
		System.out.println("Dizideki Tek Sayıların Toplamı:"+tekToplam);
		System.out.println("Dizideki Çift Sayıların Toplamı:"+ciftToplam);*/

        /*Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }*/

    }
    public class İkiSayıyıCarp {


        static void carp(int sayi1, int sayi2) {
            System.out.println("Sayıların carpımı = " + (sayi1 * sayi2));
        }
        public static void main(String[] args) {

            carp(15,5);
        }
    }}
