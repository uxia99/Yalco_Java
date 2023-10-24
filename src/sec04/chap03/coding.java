package sec04.chap03;

public class coding {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n - - - - - \n");

        for (int j = 0; j < 11; j++) {
            System.out.println(j);
        }

        System.out.println("\n - - - - - \n");

        for (double d = 123.45; d > 0; d -= 32.1) {
            System.out.println(d);
        }

        for (String s = ""; s.length() < 11; s += s.length()) {
            System.out.println(s);
        }

        System.out.println("\n - - - - - - \n");

        for (byte a = 0, b = 10; a <= b;) {
            System.out.printf("a : %d, b : %d%n", a++, b--);
        }

        String yuts = "도개걸윷모";
        char yut = '도';

        boolean isValid = false;
        for (int i = 0; i < yuts.indexOf(yut); i++) {
            isValid = true;
            System.out.println("앞으로");
        }
        if (!isValid) System.out.println("무효");

        System.out.println("\n - - - - - - \n");

        // 배열
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }

//        System.out.println("\n - - - - - - \n");
//
//        int count1 = 7;
//        int[] multiOf3 = new int[count1];
//
//        for (int i1 = 1, c1 = 0; c1 < count1; i1++) {
//            if (i1 % 3 == 0) {
//                multiOf3[c1++] = i1;
//            }
//        }

        System.out.println("\n - - - - - - \n");

       for (int num : multiOf4) {
           System.out.println(num);
       }

       int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %2d%n", i, j, i * j);
            }
        }

        System.out.println("\n - - - - - - \n");

        String[][] quotesInLangs = {
                {
                    "I am vengeance",
                    "I am night",
                    "I am Batman"
                },
                {
                    "나는 복수를 한다",
                    "나는 밤이다",
                    "나는 배트맨이다"
                },
        };

        String result = "";
        for (String[] quotes : quotesInLangs) {
            for (String quote : quotes) {
                result += quote + " ";
            }
            result = result.trim().concat("\n");
        }
        System.out.println(result);

        System.out.println("\n - - - - - \n");

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) continue;
            if (i == 10) break;

            System.out.println(i);
        }

        System.out.println("\n - - - - - \n");

        String str = "호";

        for (;;) {
            str += "롤";
            System.out.println(str);
            if (str.length() == 10) break;
        }

        str += "로";
        System.out.println(str);
    }
}