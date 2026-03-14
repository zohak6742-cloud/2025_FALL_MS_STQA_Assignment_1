public class CelsiusToFahrenheit {

    public static double convert(double celsius) {

        // Check for temperature below absolute zero
        if (celsius < -273.15) {
            System.out.println("Error: Temperature below absolute zero.");
            return Double.NaN;
        }

        // Conversion formula
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        return fahrenheit;
    }

    public static void main(String[] args) {

        double celsius = 25;

        double result = convert(celsius);

        if (!Double.isNaN(result)) {
            System.out.println("Celsius: " + celsius);
            System.out.println("Fahrenheit: " + result);
        }
    }
}
