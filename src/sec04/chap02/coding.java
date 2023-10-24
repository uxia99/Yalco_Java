package sec04.chap02;

public class coding {
    public static void main(String[] args) {
        byte fingersOut = 2;

        switch (fingersOut) {
            case 2:
                System.out.println("가위");
                break;
            case 0:
                System.out.println("바위");
                break;
            case 5:
                System.out.println("보");
                break;
            default:
                System.out.println("무효");
        }

        String direction = "north";
        String dirKor;

        switch (direction) {
            case "north":
                dirKor = "북";
                break;
            case "south":
                dirKor = "남";
                break;
            case "east":
                dirKor = "동";
                break;
            case "west":
                dirKor = "서";
                break;
            default:
                dirKor = null;
        }

        System.out.println(
                dirKor != null ? dirKor : "무효"
        );


        char yutnori = '도';

        switch (yutnori) {
            case '모': System.out.println("앞으로 다섯");
            case '윷': System.out.println("앞으로 네 칸");
            case '걸': System.out.println("앞으로 세 칸");
            case '개': System.out.println("앞으로 두 칸");
            case '도': System.out.println("앞으로 한 칸"); break;
            default:
                System.out.println("무효");
        }


        byte month = 1;
        byte season;

        switch (month) {
            case 1: case 2: case 3:
                season = 1;
                break;
            case 4: case 5: case 6:
                season = 2;
                break;
            case 7: case 8: case 9:
                season = 3;
                break;
            case 10: case 11: case 12:
                season = 4;
                break;
            default:
                season = 0;
        }
        System.out.println(
                season > 0
                ? "지금은 %d분기 입니다.".formatted(season)
                : "무효한 월입니다."
        );

        byte startMonth = 1;
        String holidays = "";

        switch (startMonth) {
            case 1:
                holidays += "설날, ";
            case 2:
            case 3:
                holidays += "3∙1절, ";
                break;
            case 4:
            case 5:
                holidays += "어린이날, ";
                break;
            case 6:
                holidays += "현충원, ";
                break;
            case 7:
            case 8:
                holidays += "광복절, ";
                break;
            case 9:
                holidays += "추석, ";
                break;
            case 10:
                holidays += "한글날, ";
                break;
            case 11:
            case 12:
                holidays += "크리스마스, ";
                break;
            default:
                holidays = null;
        }
        String result = holidays == null
            ? "잘못된 월입니다."
            : "분기 내 휴일 : " + holidays
                .substring(0, holidays.lastIndexOf(", ")) ;
    }
}