public class RightTriangleCalculator {

    public static double calculateHypotenuse(double a, double b) {

        if (a <= 0 || b <= 0) {
            System.out.println("Invalid triangle sides.");
            return -1;
        }

        double c = Math.sqrt(a * a + b * b);

        return c;
    }

    public static void main(String[] args) {

        double a = 3;
        double b = 4;

        double hypotenuse = calculateHypotenuse(a, b);

        if (hypotenuse != -1) {
            System.out.println("Hypotenuse = " + hypotenuse);
        }
    }
}
