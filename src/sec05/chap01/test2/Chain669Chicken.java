package sec05.chap01.test2;

public class Chain669Chicken {
    public static void main(String[] args) {
        // 클래스로 인스턴스를 생성
        // 본사의 방침대로 매장을 내는 것
        Main669Chicken store1 = new Main669Chicken(1, "강남");
        Main669Chicken store2 = new Main669Chicken(2, "가로수길");
        Main669Chicken store3 = new Main669Chicken(3, "홍대");

        String[] intros = {store1.intro(), store2.intro(), store3.intro()};
    }
}
