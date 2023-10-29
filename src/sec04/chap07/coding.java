package sec04.chap07;

import java.util.Scanner;

public class coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);


        System.out.println("\n - - - - - - \n");


        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();

        System.out.println("bool : " + bool);
        System.out.println("intNum : " + intNum);
        System.out.println("dblNum : " + dblNum);


        System.out.println("\n - - - - - - \n");


        System.out.println("Boolean을 입력하시오.");

        while (sc.hasNextBoolean()) {
            System.out.println("입력값 : " + sc.nextBoolean());
        }

        System.out.println("정수를 입력하시오.");

        while (sc.hasNextInt()) {
            System.out.println("입력값 : " + sc.nextInt());
        }
        sc.close();


        System.out.println("\n - - - - - - \n");


        System.out.println("단어를 입력하시오.");

        while (sc.hasNext()) {
            String nextWord = sc.next();
            if (nextWord.equalsIgnoreCase("quit")) break;
            System.out.println("입력값 : " + nextWord);
        }

        System.out.println("문장을 입력하시오.");

        while (sc.hasNextLine()) {
            String nextSentence = sc.nextLine();
            if (nextSentence.equalsIgnoreCase("quit")) break;
            System.out.println("입력값 : " + nextSentence);
        }


        System.out.println("\n - - - - - - \n");


        while (sc.hasNextInt()) {
            int repeatCount = sc.nextInt();
            for (int i = 0; i < repeatCount; i++) {
                System.out.print("Gorgeous ");
            }
            System.out.println();
        }
        sc.close();


        System.out.println("\n - - - - - - \n");


        String [] strInputs = new String[5];

        for (int i = 0; i < strInputs.length; i++) {
            strInputs[i] = sc.nextLine();
        }
        sc.close();

        for (String str : strInputs) {
            System.out.println(str);
        }
    }
}
