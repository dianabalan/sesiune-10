package method_polymorphism;

public class CalculatorTest {

    public static void main(String[] args) {
        VeryBasicCalculator calc = new VeryBasicCalculator();

        System.out.println(calc.add(12.3, 2.1));
        System.out.println(calc.add(1.0, 2.0, 3.0));

        double[] arr = {2.3, 5.2, 7.9, 10.0, 1.25};
        System.out.println(calc.add(arr));

    }
}
