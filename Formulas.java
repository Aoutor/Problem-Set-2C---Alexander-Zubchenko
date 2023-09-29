public class Formulas {
    public static OrderedPair QuadraticFormula (double a, double b, double c){
        double p1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double p2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        OrderedPair result = new OrderedPair(p1, p2);
        return (result);
    }
    public static double Slope (OrderedPair a, OrderedPair b) {
        double slope = b.getY() - a.getY() / b.getX() - a.getX();
        return slope;
    }
    public static OrderedPair MidPoint (OrderedPair a, OrderedPair b) {
        double midpoint1 = (b.getX() + a.getX()) / 2;
        double midpoint2 = (b.getY() + a.getX()) / 2;
        OrderedPair result = new OrderedPair(midpoint1, midpoint2);
        return result;
    }
    public static double ArithmeticSeries (double a, double d, int k) {
        double sum = k/2*(2*a + d*(k-1));
        return sum;
    }
    public static double GeometricSeries (double a, double r, int k) {
        double sum = a*((1-Math.pow(r, k)/1-r));
        return sum;
    }
    public static int Random(int k){
        int random = (int)(Math.random()*k) + 1;
        return random;
    }
}
