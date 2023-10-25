package sec04.chap04;

public class coding {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n - - - - - - \n");

        int i = 0;

        while (i < 10) {
            System.out.println(i++);
        }

        System.out.println("\n - - - - - - \n");

        double popInBillion = 7.837;

        while (true) {
            System.out.println("세계인구 : " + (popInBillion -= 0.1));
            if (popInBillion <= 0) break;

            System.out.println("인간의 욕심은 끝이 없고,");
            System.out.println("같은 실수를 반복한다.");
        }

        System.out.println("인류 멸종");

        System.out.println("\n - - - - - - \n");

        int j = 1;

        while (true) {
            if (j++ == 100) break;
            if ((j - 1) % 3 != 0) continue;

            System.out.println(j - 1);
        }

        System.out.println("\n - - - - - - \n");

        int a = 1;

        while (true) {
            int cur = a++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);
        }

        int b = 1;

        while (true) {
            int car = b++;

            if (car == 100) break;
            if (car % 3 != 0) continue;

            System.out.println(car);
        }

        System.out.println("\n - - - - - - \n");

        int enemies = 0;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies > 0) enemies--;
        } while (enemies > 0);

        System.out.println("사격중지 아군이다");

        System.out.println("\n - - - - - - \n");

        int x = 1;
        int y = x;

        while (x < 10) {
            System.out.println("while 문 : " + x++);
        }

        do {
            System.out.println("do ... while 문 : " + y++);
        } while (y < 10);
    }
}
