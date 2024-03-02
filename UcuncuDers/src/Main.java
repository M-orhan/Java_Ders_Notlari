//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        main mainNesnesi= new main();
        System.out.println(ucunKuvvetiKontrol(3,6));

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }

}
       static boolean ucunKuvvetiKontrol(int sayi,int us) {

       if(sayi==1 && us%2==1)
        return true;
           else {
           us++;
          return ucunKuvvetiKontrol(sayi/3, us);
            }

}
