public class GenericNumeric<T extends Number> {
    private T value;
    public GenericNumeric(T value) {
        this.value = value;
    }
    public double reciprocal() {
        if (value.doubleValue() == 0) {
            throw new ArithmeticException("Cannot compute reciprocal of zero.");
        }
        return 1.0 / value.doubleValue();

        }
        public double fractionalPart() {
            double val = value.doubleValue();
            return val - Math.floor(val);
        }
        public static boolean absEqual(Number a, Number b) {
            return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
        }
        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
         public static void main(String[] args) {
        GenericNumeric<Double> num1 = new GenericNumeric<>(9.76);
        GenericNumeric<Float> num2 = new GenericNumeric<>(-9.76f);

        System.out.println("Reciprocal of " + num1.getValue() + " = " + num1.reciprocal());
        System.out.println("Fractional part of " + num1.getValue() + " = " + num1.fractionalPart());
        System.out.println("Absolute values equal? " + GenericNumeric.absEqual(num1.getValue(), num2.getValue()));
    }
    }
