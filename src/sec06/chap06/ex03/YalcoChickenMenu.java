package sec06.chap06.ex03;

public enum YalcoChickenMenu {
    FR("Fried", 10000, 0),
    YN("Seasoned", 12000, 0),
    GJ("SoySouce", 12000, 0),
    RS("RoseSouce", 14000, 0),
    PP("Spicy", 13000, 2),
    XX("HotSpicy", 13000, 3);

    private String name;
    private int price;
    private int spicyLevel;

    YalcoChickenMenu(String name, int price, int spicyLevel) {
        this.name = name;
        this.price = price;
        this.spicyLevel = spicyLevel;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc () {
        String peppers = "";
        if (spicyLevel > 0) {
            peppers = "🌶️".repeat(spicyLevel);
        }

        return "%s %s원 %s".formatted(name, price, peppers);
    }
}
