package sec07.chap03.ex01;

public class Main {
    public static void main(String[] args) {

    }

    //  제네릭 메소드
    //  T : 타입변수. 원하는 어떤 이름으로든 명명 가능
    public static <T> T pickRandom (T a, T b) {
        return Math.random() > 0.5 ? a : b;
    }

}
