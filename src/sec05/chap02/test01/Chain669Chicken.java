package sec05.chap02.test01;

import java.awt.*;

public class Chain669Chicken {
    public static void main(String[] args) {
        Menu669[] menus = {
                new Menu669("Fried", 10000, "fry"),
                new Menu669("Seasoned", 12000, "fry"),
                new Menu669("Roast", 15000, "bake")
        };
        Main669Chicken store1 = new Main669Chicken(1, "강남", menus);
        Main669Chicken store2 = new Main669Chicken(2, "가로수길", menus);

        Menu669 order1 = store1.menuOrder("Roast");
        Menu669 order2 = store2.menuOrder("Fried");
    }
}
