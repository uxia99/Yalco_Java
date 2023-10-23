package sec03.chap08;

public class coding {
    public static void main(String[] args) {
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        int length = yutnori.length;

        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];

        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dblAry = new double[3];
        char[] chrAry = new char[3];
        String[] strAry = new String[3];

        char[] dirAry = {'동', '서', '남', '북'};

        int [] intAry1 = {1, 2, 3, 4, 5, 6, 7};
        int length1 = intAry1.length;

        // 다중배열

        int[][] dblIntAry = new int[][] {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        char[][][] trpChrAry = {
                {{'가', '나'}}, {{'다', '라'}},
                {{'마'}}, {{'바'}},
                {{'사','아'}}, {{'자', '차'}}
        };
    }
}