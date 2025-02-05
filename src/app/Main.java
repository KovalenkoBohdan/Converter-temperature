package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App");
        double far = 150;
        double cel = converterFarToCel(far);
        System.out.println("Result is " + cel + " celsiy");
    }

    private static double converterFarToCel(double far) {
        return (far - 32) * 5 / 9;
    }
}
