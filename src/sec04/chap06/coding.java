package sec04.chap06;

public class coding {
    public static void main(String[] args) {

        int res1 = add(1, 2);
        int res2 = add(3, 4, 5);
        double res3 = add(1.2, 3.4);
        String res4 = add("로보트 태권", 'V');
        String res5 = add('X', "Men");

    }

    static int add (int a, int b) {
        return a + b;
    }

    static int add (int a, int b, int c) {
        return a + b + c;
    }

    static double add (double a, double b) {
        return a + b;
    }

    static String add (String a, char b) {
        return a + b;
    }

    static String add (char a, String b) {
        return a + b;
    }

}
