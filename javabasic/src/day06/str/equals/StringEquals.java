package day06.str.equals;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "홍길동";
        String str2 = "홍길동";
        String str3 = new String("홍길동");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 같은 클래스 내부에서 문자열을 그냥 선언하면, 동일한 문자열 객체를 재활용 하게됨.(예: str1, str2)
        // 같은 클래스 내부에서 직접 문자열 생성명령을 내리거나, 다른 클래스에서 넘어온 문자열은 다른 주소값을 가지게 됨.
        // 문자열 동등비교 무자열.equals로 해야 항.

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));

        if(str1.equals(str3)){
            System.out.println("문자열 자체가 같음");
        }
    }
}
