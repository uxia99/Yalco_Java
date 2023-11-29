package sec06.chap08;

import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        //  ⚠️ 불가. 생성자 확인해 볼 것
        // Math mathInst = new Math(); // 생성자를 사용할 수 없음_인스턴스를 만들 필요가 없는 클래스기 때문

        System.out.println("\n- - - - - -\n");

        //  ⭐️ 정적 필드들

        //  자연로그의 밑
        double e = Math.E;
        double pi = Math.PI;

        System.out.println("\n- - - - - -\n");

        // ⭐️ 정적 메소드들

        //  절대값. 숫자 자료형마다 오버로드
        int absInt = Math.abs(-5);
        double absDbl = Math.abs(-3.14);

        System.out.println("\n- - - - - -\n");

        //  올림(ceil), 내림(floor), 반올림(round)
        double ceil = Math.ceil(2.34);
        double floor = Math.floor(4.56);
        double round1 = Math.round(2.34);
        double round2 = Math.round(4.56);

        System.out.println("\n- - - - - -\n");

        //  큰 수 또는 작은 수 반환. 자료형마다 오버로드
        int largerInt = Math.max(2, 3);
        float smallerFlt = Math.min(1.2f, 3.4f);

        System.out.println("\n- - - - - -\n");

        //  제곱
        double pow1 = Math.pow(4, 3); // double을 받지만 묵시 형변환
        double pow2 = Math.pow(4, 0.5);

        System.out.println("\n- - - - - -\n");

        //  0.0 이상 1.0 미만 무작위 수
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();

        //  1에서 10 사이의 무작위 정수
        int _1to10_1 = (int) Math.ceil(Math.random() * 10);
        int _1to10_2 = (int) Math.floor(Math.random() * 10) + 1;

        System.out.println("\n- - - - - -\n");

        Random random = new Random();

        //  아래를 여러 차례 실행해 볼 것

        //  ⭐ 아래를 주석해제한 뒤 실행해 볼 것 → seed가 같으면 무작위여도 결과가 같게 나옴
        //  random.setSeed(1234);

        // 무작위 정수
        int randInt1 = random.nextInt();
        int randInt2 = random.nextInt();
        int randInt3 = random.nextInt();
        // 범위 지정 (이상, 미만)
        int randInt4 = random.nextInt(0, 10);
        int randInt5 = random.nextInt(0, 10);
        int randInt6 = random.nextInt(0, 10);

        // 무작위 실수
        double randDbl1 = random.nextDouble();
        double randDbl2 = random.nextDouble();
        // 범위 지정 (이상, 미만)
        double randDbl3 = random.nextDouble(3.14, 5.67);
        double randDbl4 = random.nextDouble(3.14, 5.67);

        // true, false중 무작위
        boolean randBln1 = random.nextBoolean();
        boolean randBln2 = random.nextBoolean();

        System.out.println("\n- - - - - -\n");

        //  ~Exact 메소드들 : 자료형의 범위를 넘기면 오류 발생
        int add1 = Math.addExact(2_147_483_645, 2);
        int add2 = 2_147_483_645 + 3;
        //  int add3 = Math.addExact(2_147_483_645, 3);
    }
}
