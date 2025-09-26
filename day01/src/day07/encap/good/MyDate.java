package day07.encap.good;

public class MyDate {

    private int year;
    private int month;
    private int day;

    // 은닉변수에 접근할 때는 클래스 설계자가 만들어놓은 setter메서드를 사용.
    // setter메서드는 public으로 선언하고, 이름을(set + 멤버번수이름)으로 지정.

    public void setYear(int year) {
        // 메서드를 활용하면, 프로그램 코드로 의도치 않은 값을 피할 수 있음.
        if(year > 2025) {
            System.out.println("잘못된 값 입니다.");
            return;
        }
        this.year = year;
    }

    // 은닉변수의 값을 조회하는 용도의 메서드를 getter라고 함.
    // public으로 선언하고, 이름을 (get+멤버변수이름)으로 만듬.
    public int getYear() {
        return year;
    }

    // Month에 대한 getter/setter
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("잘못된 값 입니다.");
            return;
        }
        this.month = month;
    }

    // day에 대한 getter/setter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            System.out.println("잘못된 값 입니다.");
            return;
        }
        this.day = day;
    }

    // getter, setter 자동 완성
    // Alt + Insert -> getter나 setter 선택
    private String name;
    private int age;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
