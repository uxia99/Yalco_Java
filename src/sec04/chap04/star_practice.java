package sec04.chap04;

import java.util.Scanner;

public class star_practice {
    public static void main(String[] args) {
        // 사각형 별찍기
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
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


        // 좌측 역 직각 삼각형
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n - - - - - - \n");


        // 우측 역 직각 삼각형
        for (int i = 0; i < 5; i++) {
            // 공백 j
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star j
            for (int s = 5; s > i; s--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n - - - - - - \n");


        // 역 피라미드
        for (int i = 0; i < 5; i++) {
            // 좌측 공백 j
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star j
            for (int j = i; j < 2 * 5 - i - 1; j++) {
                System.out.print("*");
            }
            // 우측 공백 j
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n - - - - - - \n");


        // 세로로 긴 삼각형(좌측)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n - - - - - - \n");


        // 세로로 긴 삼각형(우측)
        for(int i = 0; i < 5; i++) {
            String stars = "";
            // 증가
            for(int j = 0; j < 5 - i; j++) {
                stars += " ";
            }
            for(int j = 0; j < i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }

        for(int i = 0; i < 5; i++) {
            String stars = "";
            // 감소
            for(int j = 0; j < i; j++) {
                stars += " ";
            }
            for(int j = 0; j < 5 - i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }


        System.out.println("\n - - - - - - \n");


        // 마름모
        for(int i = 1; i <= 5; i++) {
            // 왼쪽 공백
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별 개수
            for(int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            // 오른쪽 공백
            for(int l = 5; l > i; l--) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i = 1; i < 5; i++) {
            // 왼쪽 공백
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 별 수
            for(int k = i; k < 2 * 5 - i - 1; k++) {
                System.out.print("*");
            }
            // 오른쪽 공백
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("\n - - - - - - \n");


        // 마름모
        for(int i = 0; i < 5; i++) {
            // 왼쪽 공백
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별 개수
            for(int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            // 오른쪽 공백
            for(int l = 5; l > i; l--) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i = 0; i < 5; i++) {
            // 왼쪽 공백
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 수
            for(int k = i; k < 2 * 5 - i - 1; k++) {
                System.out.print("*");
            }
            // 오른쪽 공백
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}