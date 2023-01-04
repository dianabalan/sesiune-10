package interfaces.exercises.calculator;

public class MyCalculator implements Calculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by 0");
            return a < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        return a / b;
    }

    @Override
    public double min(double a, double b) {
        return Math.min(a, b);
    }

    @Override
    public double max(double a, double b) {
        return Math.max(a, b);
    }
}