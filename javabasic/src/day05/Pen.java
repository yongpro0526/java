package day05;

// 객체를 만들기 위한 설계도 클래스(이런 클래스는 메인이 없음.
public class Pen {
    // 클래스의 속성을 나타내는것. 멤버변수(field)
    String ink;
    int price;

    // 클래스의 기능을 나타내는것. 메서드
    void write() {
        System.out.println("====info====");
        System.out.println("색상: " + ink);
        System.out.println("가격: " + price);
    }

}
