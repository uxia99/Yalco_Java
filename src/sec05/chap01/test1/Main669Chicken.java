package sec05.chap01.test1;

public class Main669Chicken {
    // 인스턴스가 가질 속성(필드 field)
    int no;
    String name;

    // 인스턴스가 가질 메소드(기능)
    String intro () {
        return "안녕하세요, 669치킨 %d호 %s점 입니다."
                .formatted(no, name);
    }
}
