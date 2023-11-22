package sec06.chap06.ex03;

import sec05.chap08.ex01.YalcoChicken;

public class Main {
    public static void main(String[] args) {
        YalcoChickenMenu menu1 = YalcoChickenMenu.YN;
        YalcoChickenMenu menu2 = YalcoChickenMenu.RS;
        YalcoChickenMenu menu3 = YalcoChickenMenu.XX;

        var menu1Name = menu1.getName();
        var menu2Price = menu2.getPrice();
        var menu3Desc = menu3.getDesc();

        menu2.setPrice(16000);
        var menu2NewPrice = menu2.getPrice();
    }
}
