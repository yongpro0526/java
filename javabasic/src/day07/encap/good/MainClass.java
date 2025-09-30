package day07.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        myDate.setYear(2025);
        myDate.setMonth(9);
        System.out.println(myDate.getMonth());
        myDate.setDay(24);
        System.out.println(myDate.getDay());
        int year = myDate.getYear();
        int month = myDate.getMonth();
        int day = myDate.getDay();
        System.out.println("당신의 생일: " + year + "년 " + month + "월 " + day + "일");
    }
}
