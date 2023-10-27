package sec04.chap05;

public class coding {
    public static void main(String[] args) {
        double x = 3, y = 4;
        arithmetic(x, y);

        x = 5; y = 2;
        arithmetic(x, y);

        x = 13; y = 9;
        arithmetic(x, y);
    }

    static void arithmetic (double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }
}
