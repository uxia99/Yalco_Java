package sec05.chap01.test1;

public class Sub669Chicken {
    public static void main(String[] args) {
        // 본사 소속 매장 설정
        Main669Chicken store1 = new Main669Chicken();
        store1.no = 1;
        store1.name = "강남";

        Main669Chicken store2 = new Main669Chicken();
        store2.no = 2;
        store2.name = "가로수길";

        // 인스턴스의 필드(속성)에 접근
        int store1No = store1.no;
        String store1Name = store1.name;
        int store2No = store2.no;
        String store2Name = store2.name;

        // 인스턴스의 메소드 호출
        String store1Intro = store1.intro();
        String store2Intro = store2.intro();
    }
}
