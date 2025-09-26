package day01;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 자동으로 줄바꿈 해줌.

        System.out.print("안녕하세요!\n"); // 줄바꿈을 안 하지만, \n을 넣으면 줄바꿈이 됨.
        System.out.print("안녕하세요!\n");

        System.out.printf("저의 이름은 %s이고 나이는 %d살입니다.", "홍길동", 20);

        // 서식문자
        // %s 문자열
        // %d 정수
        // %f 실수
        // %.2f 실수 부분 2자리수 까지 표현함
    }
}