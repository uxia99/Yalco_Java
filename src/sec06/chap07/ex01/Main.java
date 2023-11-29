package sec06.chap07.ex01;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("홍길동", 2020, Gender.MALE);
        //  💡 toString 메소드 구현 (이후 배울 Object에서 상속받아 오버라이드)
        String childStr = child1.toString();

        var children = new Child[] {
                new Child("장유정", 1999, Gender.FEMALE),
                new Child("김재헌", 1997, Gender.MALE),
                new Child("장우진", 2003, Gender.MALE),
                new Child("김은서", 1999, Gender.FEMALE),
        };

        for (var child : children) {
            System.out.printf(
                    "%s %d년생 %s 어린이%n",
                    child.gender().getEmoji(),
                    child.birthYear(),
                    child.name()
            );
        }
    }
}

