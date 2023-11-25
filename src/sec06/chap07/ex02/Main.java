package sec06.chap07.ex02;

import static sec06.chap07.ex02.Button.*;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        Button.ClickInfo click1 = button.func(123, 456, ClickedBy.LEFT);
        Button.ClickInfo click2 = button.func(492, 97, ClickedBy.LEFT);
        Button.ClickInfo click3 = button.func(12, 36, ClickedBy.RIGHT);

        for (var click : new Button.ClickInfo [] {click1, click2, click3}) {
            click.printInfo();
        }
    }
}
