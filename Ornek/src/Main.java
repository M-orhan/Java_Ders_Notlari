//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Main ac=new Main();
        //System.out.println(ucunKuvvetiKontrol(27));
        //System.out.println(asalKontrol(2));
        //System.out.println(asalKontrolOzyinelemeli(17,17/2));
        System.out.println(faktoriyel(6));
        //System.out.println(ac.faktoriyelOzyinelemeli(5));

    }

    static boolean ucunKuvvetiKontrol(double sayi)
    {

        if(sayi==1 && sayi%2==1)
            return true;
        else if(sayi<3)
            return false;
        else {
            return ucunKuvvetiKontrol(sayi/3);
        }
    }

    static boolean asalKontrol(int sayi)
    {
        boolean sonuc=true;
        if(sayi<2)
            sonuc=false;
        else
        for(int i=2;i<sayi;i++)
        {
            if(sayi%i==0)
                sonuc=false;
        }
        return sonuc;
    }

    static boolean asalKontrolOzyinelemeli(int sayi,int i)
    {
        if(i==1)
            return true;
        else
        {
            if(sayi%i==0)
                return false;
            else
                return asalKontrolOzyinelemeli(sayi,i-1);
        }
    }

    static int faktoriyel(int sayi)
    {
        int sonuc=1;
        for(int i=1;i<=sayi;i++)
        {
            sonuc = sonuc * i; //sonuc *=i
        }
        return sonuc;
    }

    int faktoriyelOzyinelemeli(int sayi)
    {
        if(sayi>=1)
            return sayi*faktoriyelOzyinelemeli(sayi-1);
        else
            return 1;
    }
}