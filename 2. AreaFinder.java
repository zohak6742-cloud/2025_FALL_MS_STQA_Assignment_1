public class AreaFinder {

    public static double findArea(String shape, double a, double b) {

        double area;

        if (shape.equalsIgnoreCase("circle")) {

            if (a <= 0) {
                System.out.println("Invalid radius.");
                return -1;
            }

            area = Math.PI * a * a;

        } else if (shape.equalsIgnoreCase("triangle")) {

            if (a <= 0 || b <= 0) {
                System.out.println("Invalid base or height.");
                return -1;
            }

            area = 0.5 * a * b;

        } else if (shape.equalsIgnoreCase("rectangle")) {

            if (a <= 0 || b <= 0) {
                System.out.println("Invalid length or width.");
                return -1;
            }

            area = a * b;

        } else if (shape.equalsIgnoreCase("square")) {

            if (a <= 0) {
                System.out.println("Invalid side.");
                return -1;
            }

            area = a * a;

        } else {

            System.out.println("Error: Unknown shape.");
            return -1;
        }

        return area;
    }

    public static void main(String[] args) {

        double result = findArea("circle", 5, 0);

        System.out.println("Area = " + result);
    }
}
