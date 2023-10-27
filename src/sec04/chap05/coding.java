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


        System.out.println("\n - - - - - - \n");


        double avg = getAverage(new int[] {3, 5, 4, 11, 7});


        System.out.println("\n - - - - - - \n");


        int[] numbers = {3, 5, 9, 1, 13, 4, 29};

        int maxOfNumbers = getMaxAndMin(numbers)[0];
        int minOfNumbers = getMaxAndMin(numbers)[1];


        System.out.println("\n - - - - - - \n");


        double avg1 = getAverage1(3, 91, 14, 93, 24);


        System.out.println("\n - -  - - - - \n");


        String[] kids = {"짱구", "철수", "유리", "훈이", "맹구"};
        String class3DescByArr = descClass(2, "나미리", kids);
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

    static double getAverage (int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    static int[] getMaxAndMin (int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
        }
        return new int[] {max, min};
    }

    static double getAverage1(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }

    static String descClass (int classNo, String teacher, String... kids) {
        return "%d반의 담임은 %s 선생님, 원생들은 %s 입니다."
                .formatted(classNo, teacher, String.join(",", kids));
    }
}
