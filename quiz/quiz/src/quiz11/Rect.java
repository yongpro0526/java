package quiz11;

public class Rect extends Shape{
	
	// 1. 변의 길이 선언
	// 2. 사각형은 생성될 때 이름과, 변의 길이를 받음
	// 3. getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	// main에서 확인

    private int width;
    private int height;

    public Rect(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
