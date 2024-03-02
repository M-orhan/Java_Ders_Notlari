public class Matematik {

    static final double TAU=Math.PI*2;
    final static String GoldenRateRaw="1.618";

    static boolean GoldenRate(double number1,double number2)
    {
        double value=Math.max(number1,number2);
        double goldenrate=(number1+number2)/value;

        String goldenrateString=(goldenrate+"").substring(0,5);
        if(GoldenRateRaw.equals(goldenrateString))
        {
            return true;
        }
        else
            return false;




    }
}
