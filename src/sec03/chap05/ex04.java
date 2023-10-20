package sec03.chap05;

public class ex04 {
    public static void main(String[] args) {
        //  💡 타 자료형으로부터 문자열로 변환
        String str1 = String.valueOf(true);
        String str2 = String.valueOf(false);
        String str3 = String.valueOf(123);
        String str4 = String.valueOf(3.14f);
        String str5 = String.valueOf('가');

        String str6 = true + "";
        String str7 = 123.45 + "";

        String str123 = "123";

        //  문자열을 정수 자료형으로 변환하기
        byte bytNum = Byte.parseByte(str123);
        short srtNum = Short.parseShort(str123);
        int intNum = Integer.parseInt(str123);
        long lngNum = Long.parseLong(str123);


    }
}