package day08.static_.method;

public class MainClass {
    public static void main(String[] args) {
        // main도 static 메서드 입니다.
        Count.method02(); // static 메서드

        // 일반 멤버변수 객체를 쓰고 싶으면
        Count count = new Count();
        count.method01(); // 일반 메서드

        // 자바 내부에 많은 static 메서드가 존재함.
        // Math.random();
    }
}
