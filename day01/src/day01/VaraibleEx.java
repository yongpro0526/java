package day01;

public class VaraibleEx {
    public static void main(String[] args) {

        // 변수의 선언
        int num;
        // 변수의 초기화
        num = 20;
        System.out.println(num);

        // 선언과 초기화
        int num2 = 20;
        System.out.println(num2);

        int result = num + num2;
        System.out.println(result);

        // 문자열을 저장하는 변수
        String name = "홍길동";

        // 변수의 범위
        int a = 10;
        if(true) {
            int b = 20; // if문 중괄호를 벗어나면 b 변수는 사용하지 못 함.
            System.out.println(a);
            System.out.println(b);
        }

    }
}
