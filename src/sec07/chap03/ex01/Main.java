package sec07.chap03.ex01;

import sec05.chap08.ex01.YalcoChicken;

public class Main {
    public static void main(String[] args) {
        int randNum = pickRandom(123, 456);
        boolean randBool = pickRandom(true, false);
        String randStr = pickRandom("마루치", "아라치");

        //  import sec05.chap08.ex01.YalcoChicken;
        YalcoChicken store1 = new YalcoChicken("판교");
        YalcoChicken store2 = new YalcoChicken("역삼");
        YalcoChicken randStore = pickRandom(store1, store2);

        //  ⚠️ 타입이 일관되지 않고 묵시적 변환 불가하면 오류
        //  double randFlt = pickRandom("hello", "world");
        double randDbl = pickRandom(12, 34);
    }

    //  제네릭 메소드
    //  T : 타입변수. 원하는 어떤 이름으로든 명명 가능
    public static <T> T pickRandom (T a, T b) {
        return Math.random() > 0.5 ? a : b;
    }

}
