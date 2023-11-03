package sec05.chap09.ex01;

public class FlyingSquirrel extends Mammal implements Flyer { // 날다람쥐
    public FlyingSquirrel() {
        super(true);
    }

    @Override
    public void fly() {
        System.out.println("익막으로 활공");
    }
}
