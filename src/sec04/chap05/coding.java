package sec04.chap05;

public class coding {
    public static void main(String[] args) {
        double x = 3, y = 4;
        arithmetic(x, y);

        x = 5; y = 2;
        arithmetic(x, y);

        x = 13; y = 9;
        arithmetic(x, y);


        System.out.println("\n - - - - - - \n");


        int int1 = add(2, 3);
        System.out.println(int1);

        System.out.println(add(4, 5));

        int int2 = add(add(6, 7), add(8, 9));
        System.out.println(int2);


        System.out.println("\n - - - - - - \n");


        System.out.println(
                checkIfContain(
                        "Hello World",
                        "hello"
                ) ? "Contain" : "Not Contain"
        );
    }

    static void arithmetic (double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }

    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static boolean checkIfContain (String text, String token) {
        return text.toLowerCase() .contains(token.toLowerCase());
    }

}
