package day05;

public class PhoneMain {
    public static void main(String[] args) {
        // new 키워드 다음에 오는게 생성자이다.
        // 보통 멤버변수를 초기화 하는 역할로 사용함.
        Phone phone = new Phone();
        phone.info();

        // 외부에서 멤버변수 값을 지정할 수 있음.
        Phone red = new Phone("레드");
        red.info();

        Phone blue = new Phone("파랑", 10000);
        blue.info();

        // model, color, price를 받는 생성자를 만들고,
        // 각 초기값을 지정하고, 객체생성을 해서 확인
        Phone yellow = new Phone("아이스크림2", "노랑", 1000);
        yellow.info();
    }
}
