package method_polymorphism;

public class VeryBasicCalculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double[] vars) {
        double sum = 0;
        for (int i=0;i<vars.length;i++){
            sum+=vars[i];
        }
        return sum;
    }
}
