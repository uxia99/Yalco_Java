package sec04.chap06;

public class coding {
    public static void main(String[] args) {

        int res1 = add(1, 2);
        int res2 = add(3, 4, 5);
        double res3 = add(1.2, 3.4);
        String res4 = add("로보트 태권", 'V');
        String res5 = add('X', "Men");

        System.out.println("\n - - - - - \n");

        int intNum = 3;
        modifyIntArg(intNum);

        int[] intNums = {1, 2, 3};

        modifyIntArg(intNums[0]);

        modifyAryElem(intNums);

        System.out.println("\n - - - - - \n");

        upTo5(0);
        upTo5(2);
        upTo5(4);

        System.out.println("\n - - - - - \n");

        int fact1 = factorial(1);
        int fact2 = factorial(2);
        int fact3 = factorial(3);
        int fact4 = factorial(4);
        int fact5 = factorial(5);

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

    static void modifyIntArg (int num) {
        System.out.printf("수정 전 : %d%n", num++);
        System.out.printf("수정 후 : %d%n", num);
    }

    static void modifyAryElem (int[] ary) {
        System.out.printf("수정 전 : %d%n", ary[1]++);
        System.out.printf("수정 후 : %d%n", ary[1]);
    }

    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("-- End --");
        }
    }

    static int factorial (int num) {
        return num == 0 ? 1 : num * factorial(--num);
    }
}
