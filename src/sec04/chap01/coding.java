package sec04.chap01;

public class coding {
    public static void main(String[] args) {
        boolean open = true;
        int saleFrom = 10, saleTo = 20;
        int today = 15;

        if (open) System.out.println("영업중");
        if (!open) System.out.println("영업종료");

        if (today >= saleFrom && today <= saleTo) {
            System.out.println("세일중입니다.");
            System.out.println("전품목 20% 할인");
        }

        if (open) {
            System.out.println("Open");
        } else {
            System.out.println("Closed");
        }

        // 중첩 if문

        boolean willOrderCoffee = true;
        boolean likeMilk = false;
        boolean likeIce = true;
        boolean likeSweet = true;
        boolean angry = false;
        int myRank = 2;

        if (willOrderCoffee) {
            String toOrder = "";

            toOrder = likeMilk ? "Latte" : "Americano";
            if (likeIce) toOrder = "Ice" + toOrder;
            if (!likeSweet) toOrder = "Andantino";

            System.out.printf("Can I order %s?%n", toOrder);
        } else {
            if (!angry || myRank > 3) {
                System.out.println("I'm fine");
            } else {
                System.out.println("Fuck U");
            }
        }

        // 성적표

        int score = 85;

        if (score > 90) {
            System.out.println('A');
        } else if (score > 80) {
            System.out.println('B');
        } else if (score > 70) {
            System.out.println('C');
        } else if (score > 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }

        if (score > 90) {
            System.out.println('A');
            return;
        } else if (score > 80) {
            System.out.println('B');
            return;
        } else if (score > 70) {
            System.out.println('C');
            return;
        } else if (score > 60) {
            System.out.println('D');
            return;
        }
        System.out.println('F');
    }
}