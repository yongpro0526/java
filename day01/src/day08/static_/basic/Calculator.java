package day08.static_.basic;

public class Calculator {

    // 계산기 마다 각기 다른 값을 가져야 하는 경우는 일반변수로 선언.
    // 계산시 마다 동일한 값을 가진다면, static변수로 선언해야함.
    private static String color;
    private int result;
    public double pi = 3.14;

    // 일반 메서드를 참조하는 메서드는 일반 메서드로 만들면 됨.
    // 클래스 안에서 볌용성있게 사용하는 메서드는 static 키워드를 붙이면 좋음.

//    public static void setColor(String color) {
//        this.color = color;
//    }
    public String getColor() {
        return color;
    }

    public double circle(int radius) {
        return pi + radius * radius;
    }
}
