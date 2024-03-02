//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Veri türü değiştirme
        short veri1=100;
        int veri2;
        veri2=veri1;

        byte veri5;
        int veri6=127;
        veri5=(byte)veri6;
        System.out.println(veri5);

        String shortSayi="1000";
        short shortsayi1=Short.parseShort(shortSayi);
        short shortsayi2=Short.valueOf(shortSayi);

        String[][] adSoyad=new String[2][3];
        adSoyad[0][0]="Hasan";
        adSoyad[0][1]="Hüseyin";
        adSoyad[0][2]="Öztürk";

        adSoyad[1][0]="Mehmet";
        adSoyad[1][1]="Ali";
        adSoyad[1][2]="Yılmaz";

        for(int i=0; i<adSoyad.length;i++)
        {
            System.out.println();
            for(int j=0; j<adSoyad[i].length;j++)
                System.out.print(adSoyad[i][j]+ " ");
        }

        int x=9;
        System.out.println();
        System.out.println(x);
    }
}