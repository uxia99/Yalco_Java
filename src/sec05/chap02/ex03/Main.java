package sec05.chap02.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("Fried", 10000),
                new ChickenMenu("Seasoned", 12000),
                new ChickenMenu("Roast", 15000, "bake")
        };
        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("Seasoned");
        ChickenMenu order2 = store1.orderMenu("Roast");


        int int1 = 1;
        int int2 = int1;
        int1 = 2;

        String str1 = "Hello";
        String str2 = str1;
        String str3 = "World";

        ChickenMenu menu1 = new ChickenMenu("Fried", 10000);
        ChickenMenu menu2 = menu1;
        menu1.price = 1200;


        System.out.println("\n - - - - - - \n");


        int avgChickenPrice = 12000;
        ChickenMenu chickenMenu1 = new ChickenMenu("Seasoned", 12000);

        raisePrice(avgChickenPrice, chickenMenu1, 1000);
    }
    public static void raisePrice (int avg, ChickenMenu menu, int amount) {
        avg += amount;
        menu.price += amount;
    }
}
