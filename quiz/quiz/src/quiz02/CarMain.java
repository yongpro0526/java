package quiz02;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("포니");
        car.accelerate();
        car.getCarInfo();
        car.brake();
        car.getCarInfo();
    }
}
