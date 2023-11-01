package sec05.chap06.ex02;

public class Main {
    public static void main(String[] args) {
//        sec05.chap05.ex01.YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");
//
//        dtStore1.takeHallOrder(); // YalcoChicken의 홀 주문 받음
//
//        dtStore1.takeDTOrder(); // YalcoChickenDT의 주문 받음
//        dtStore1.setDriveThruOpen(false); // DT 문도 닫음
//        dtStore1.takeDTOrder();

        System.out.println("\n- - - - -\n");

        YalcoChicken ycStores[] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "강남"),
                new sec05.chap06.ex02.YalcoChickenDT(108, "철원")
        };

        for (YalcoChicken store : ycStores) {
            if (store instanceof YalcoChickenDT) {
                ((YalcoChickenDT) store).takeDTOrder();
            } else {
                store.takeHallOrder();
            }
        }
    }
}
