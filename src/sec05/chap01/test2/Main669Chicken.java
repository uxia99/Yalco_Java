package sec05.chap01.test2;

public class Main669Chicken {
    // 인스턴스가 가질 속성(필드)
    int no;
    String name;

    // 생성자 : 인스턴스를 만드는 메소드
    // this : 생성될 인스턴스를 지칭
    Main669Chicken (int no, String name) {
        this.no = no;
        this.name = name;
    }



    // 인스턴스가 가질 메소드(기능)
    String intro () {
        return "안녕하세요, 669치킨 %d호 %s점 입니다."
                .formatted(no, name);
    }
}
