package sec06.chap09;

import java.time.*;

public class Coding {
    public static void main(String[] args) {
        //  ⭐️ java.time의 클래스들은 생성자 대신
        //  - 필요에 따라 적합한 클래스 메소드로 인스턴스 생성

        //  💡 현재 날짜
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //  💡 현재 시간
        LocalTime thisTime = LocalTime.now();
        System.out.println(thisTime);

        //  💡 현재 시간과 날짜
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //  ⭐️ now 메서드 : 현재의 시간/날짜 정보를 가진
        //  해당 클래스의 인스턴스를 반환
        //  시스템(컴퓨터)의 시계를 기준으로 함


        System.out.println("\n- - - - -\n");


        LocalDate christmas23 = LocalDate.of(2023, 12, 25);
        System.out.println(christmas23);

        LocalTime lunchTime = LocalTime.of(12, 30);
        LocalTime lunchTimeeDetailed = LocalTime.of(
                12, 30, 0, 0
        ); // 초, 나노초까지 더할 수 있음
        System.out.println(lunchTime);

        LocalDateTime familyDinner = LocalDateTime.of(
                2023, 12, 31, 18, 0
        );
        System.out.println(familyDinner);
        //  LocalDateTime 인스턴스는 LocalDate와 LocalTime 인스턴스의 조합으로
        //  만들어짐 클래스 코드에서 확인 (of 메소드)


        System.out.println("\n- - - - -\n");


        //  ⭐️ java.time의  Local... 클래스 인스턴스들은 불변
        //  - 생성자 사용이 금지된 것은 인스턴스 생성을 제한하기 위함
        //  - of 메소드를 사용하여, 적절할 때만 생성된 것을 받도록

        //  💡 주어진 차이만큼의 시간이나 날짜를 '새로 만들어' 반환
        today.plusDays(1); // ⭐️ 기존 인스턴스는 변하지 않음
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);

        for (LocalDate day : new LocalDate[] {today, tomorrow, yesterday}) {
            System.out.println(day);
        }


        System.out.println("\n- - - - -\n");


        LocalDate threeMonthsLater = today.plusMonths(3);
        LocalDate tenMonthBefore = today.minusMonths(10);

        //  💡 메소드 체이닝 사용

        var hourAndHalfLater = thisTime
                .plusHours(1)
                .plusMinutes(30);

        var randomPast = now
                .minusYears(1)
                .plusMonths(2)
                .minusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6)
                .minusNanos(7);

    }
}
