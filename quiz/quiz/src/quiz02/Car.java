package quiz02;

public class Car {
    String brand;
    int speed;

    Car(String brand) {
        this.brand = brand;
    }

    void accelerate() {
        for(int i = 0; i <= 100; i += 10) {
            speed = i;
            System.out.println("현재속도: " + speed);
        }
    }

    void brake() {
        for(int i = 100; i >= 0; i -= 10) {
            speed = i;
            System.out.println("현재속도: " +  speed);
    }
}

void getCarInfo() {
    System.out.println("====car info====");
    System.out.println("브랜드: " + brand);
        System.out.println("현재속도: " + speed);
    }
}
