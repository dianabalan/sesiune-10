package interfaces.exercises.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new MyCalculator();
        double result = calculator.add(1, 2);
        System.out.println("Result: " + result);
        result = calculator.subtract(4, 2);
        System.out.println("Result: " + result);
        result = calculator.multiply(2, 3);
        System.out.println("Result: " + result);
        result = calculator.divide(6, 2);
        System.out.println("Result: " + result);
    }
}