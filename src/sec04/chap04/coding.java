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

        System.out.println("\n - - - - - - \n");

        final int LINE_WIDTH = 7;

        int line_width = LINE_WIDTH;

        while (line_width > 0) {
            int starsToPrint = line_width--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n - - - - - - \n");

//        final int STAR_WIDTH = 0;
//
//        int star_width = STAR_WIDTH;
//
//        while (star_width >= 0) {
//            int starsPrint = star_width++;
//            while (starsPrint++ <= 5) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int s = LINE_WIDTH; s > 0; s--) {
            for (int t = s; t > 0; t--) {
                System.out.print("@");
            }
            System.out.println();
        }











        System.out.println("\n - - - - - - \n");

//        // 사각형 별찍기
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        for(int i=1;i<5;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int i=1;i<5;i++){
//            for(int j=4;j>0;j--){
//                if(i<j){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }

//        for(int i=0;i<4;i++){
//            for(int j=0;j<3-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        System.out.println("홀수를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i=0;i<num;i++){
//            for (int j=0; j<num;j++)
//            {
//                if (i<=num/2)// 위쪽 영역
//                {
//                    if (i+j<=num/2-1)// 왼쪽 위 공백찍기
//                        System.out.print(" ");
//                    else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
//                        System.out.print(" ");
//                    else
//                        System.out.print("*");// *찍기
//                }
//                else if (i>num/2) //아래쪽 영역
//                {
//                    if (i-j>=num/2+1) //왼쪽 밑 공백
//                        System.out.print(" ");
//                    else if (i+j>=num/2*3+1)//오른쪽 밑 공백
//                        System.out.print(" ");
//                    else
//                        System.out.print("*"); // *찍기
//                }
//            }
//            System.out.println();//줄바꿈
//        }












    }
}
