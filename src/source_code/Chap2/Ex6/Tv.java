package source_code.Chap2.Ex6;

// 예제 6-1

public class Tv {
    // TV의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // TV의 기능(메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

