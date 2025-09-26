package quiz11;

public class Circle extends Shape {

    // 1. 반지름 선언
	// 2. 원형은 생성될 때 이름과, 반지름을 받습니다.
	// 3. getArea()는 원의 넓이를 계산하도록 오버라이딩
	// main에서 확인

    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }
}