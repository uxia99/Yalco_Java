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
    }
}
