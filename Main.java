import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose formula:\n");
        System.out.println("1 = Quadratic Formula");
        System.out.println("2 = Slope Formula");
        System.out.println("3 = Midpoint Formula");
        System.out.println("4 = Sum of an Arithmetic Sequence");
        System.out.println("5 = Sum of a Geometric Sequence");
        System.out.println("6 = Random Number Formula");
        int answer = input.nextInt();
        if (answer == 1) {
            System.out.println("You chose quadratic formula, enter a, b, and c");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            OrderedPair result = Formulas.QuadraticFormula(a, b, c);
            System.out.println("Answer: " + result);
        } else if (answer == 2) {
            System.out.println("You chose slope formula, enter x1, x2, y1, and y2");
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y1 = input.nextDouble();
            double y2 = input.nextDouble();
            OrderedPair a = new OrderedPair(x1, x2);
            OrderedPair b = new OrderedPair(y1, y2);
            double result = Formulas.Slope(a, b);
            System.out.println("Answer: " + result);
        } else if (answer == 3) {
            System.out.println("You chose midpoint formula, enter x1, x2, y1, and y2");
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y1 = input.nextDouble();
            double y2 = input.nextDouble();
            OrderedPair a = new OrderedPair(x1, x2);
            OrderedPair b = new OrderedPair(y1, y2);
            System.out.println("Answe: " + Formulas.MidPoint(a, b));
        } else if (answer == 4) {
            System.out.println("You chose sum of arithmetic sequence, enter a, d, and k");
            double a = input.nextDouble();
            double d = input.nextDouble();
            int k = input.nextInt();
            System.out.println("Answer :" + Formulas.ArithmeticSeries(a, d, k));
        } else if (answer == 5) {
            System.out.println("You chose geometric sequence, enter a, r, and k");
            double a = input.nextDouble();
            double r = input.nextDouble();
            int k = input.nextInt();
            System.out.println("Answer :" + Formulas.GeometricSeries(a, r, k));
        } else if (answer == 6) {
            System.out.println("You chose random number, enter k");
            int k = input.nextInt();
            System.out.println("Answer :" + Formulas.Random(k));
        } else {
            System.out.println("error");
        }
    }
}