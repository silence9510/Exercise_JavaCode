public class NumsPower {
    public double Power(double base, int exponent) {
        if (base == 0.0 && exponent < 0) return 0;
        return exponent < 0 ? (1.0 / powerWithUnsignedExponent(base, -exponent)) : powerWithUnsignedExponent(base, exponent);
    }
    public double powerWithUnsignedExponent(double base, int exponent){
        double result = 1.0;
        for (int i = 0; i < exponent; i++)
            result = result * base;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(3.0, -3));
        System.out.println(new NumsPower().Power(3.0, -3));
    }
}
