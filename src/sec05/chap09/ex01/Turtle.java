package sec05.chap09.ex01;

public class Turtle extends Reptile implements Swimmer {
    @Override
    public void swim() {
        System.out.println("네 다리로 수영");
    }
}
