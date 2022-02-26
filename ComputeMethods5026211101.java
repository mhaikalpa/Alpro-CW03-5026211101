
public class ComputeMethods5026211101 {

    public static void fToC(double f) {

        double celsius = 5.0/9.0 * (f-32);
        System.out.println("Temp in celsius is " + celsius);

    }

    public static void hypotenuse(int a, int b) {

        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse is " + c );

    }

    public static void roll() {

        int die1 = (int) (6*Math.random()+1);
        int die2 = (int) (6*Math.random()+1);
        int SumofDice = die1+die2;
        System.out.println("The sum of the dice values is " +SumofDice);

    }
}
