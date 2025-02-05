package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App");
        double far = 150;
        double cel = converterFarToCel(far);
        double cels = 25;
        double frt = converterCelToFar(cels);
        System.out.println("Result is " + cel + " celsiy and fahrenheit " + frt);
    }

    private static double converterCelToFar(double cels) {
        return (cels * 9 / 5) + 32;
    }

    private static double converterFarToCel(double far) {
        return (far - 32) * 5 / 9;
    }
}
