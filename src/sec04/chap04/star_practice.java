package sec04.chap04;

import java.util.Scanner;

public class star_practice {
    public static void main(String[] args) {
        // 사각형 별찍기
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n - - - - - - \n");

        // 좌측 직각 삼각형
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n - - - - - - \n");

        // 우측 직각 삼각형
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("\n - - - - - - \n");

        // 피라미드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n - - - - - - \n");

        // 마름모
//        System.out.println("홀수인 정수를 입력하시오");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                if (i < num / 2) { // 윗쪽 영역
//                    if (i + j <= num / 2 - 1) // 왼쪽 위 공백
//                        System.out.print(" ");
//                    else if (j - i >= num / 2 + 1) // 오른쪽 위 공백
//                        System.out.print(" ");
//                    else
//                        System.out.println("*");
//            }
//            else if (i > num / 2) { // 아랫쪽 영역
//                    if (i - j >= num / 2 + 1) // 왼쪽 밑 공백
//                        System.out.print(" ");
//                    else if (i + j >= num / 2 * 3 + 1) // 오른쪽 밑 공백
//                        System.out.print(" ");
//                    else
//                        System.out.print("*");
//                }
//            }
//        }
//            System.out.println();
    }
}