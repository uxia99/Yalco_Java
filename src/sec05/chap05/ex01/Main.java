package sec05.chap05.ex01;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

        dtStore1.takeHallOrder(); // YalcoChicken의 홀 주문 받음

        dtStore1.takeDTOrder(); // YalcoChickenDT의 주문 받음
        dtStore1.setDriveThruOpen(false); // DT 문도 닫음
        dtStore1.takeDTOrder();
    }
}
