package sec05.chap02.test01;

import sec05.chap02.ex03.ChickenMenu;

public class Main669Chicken {
    int no;
    String name;
    Menu669[] menus;

    public Main669Chicken(int no, String name, Menu669[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    Menu669 menuOrder(String name) {
        for (Menu669 menu : menus) {
            if (menu.name.equals(name)) {
                return menu;
            }
        }
        return null;
    }
}