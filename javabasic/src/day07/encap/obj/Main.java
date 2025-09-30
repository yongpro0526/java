package day07.encap.obj;

public class Main {
    public static void main(String[] args) {
        // 객체는 그냥 주소값을 전달하면 됨!(변수로)
        Chef chef = new Chef();

        // hotel 객체 생성
//        Hotel hotel = new Hotel(chef);
        Hotel hotel = new Hotel(new Chef());

        hotel.setChef(chef);
        Chef c = hotel.getChef();
        c.cooking();
    }
}
