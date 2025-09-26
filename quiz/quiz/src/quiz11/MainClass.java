package quiz11;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(" 원", 3);
        Shape rect = new Rect(" 직사각형", 4, 5);
        System.out.println(circle.getName() + "의 넓이는 " + circle.getArea() + "이다.");
        System.out.println(rect.getName() + "의 넓이는 " + rect.getArea() + "이다.");
    }
}
