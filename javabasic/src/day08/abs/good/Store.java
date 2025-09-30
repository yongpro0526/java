package day08.abs.good;

public abstract class Store {
    // 추상메서드
    // abstract 키워드를 붙이면 추상메서드가 됨. 추상메서드는 몸체{}가 없는 메서드 선언
    // 추상메서드를 쓰고 싶으면, 추상클래스여야함.

    // 추상클래스도 멤버변수, 생성자, 일반 메서드를 가질 수 있음.
    // 단, 객체 생성은 불가.

    public abstract void chicken1();
    public abstract void chicken2();
    public abstract void chicken3();

    public String storeName = "호식이 두마리 치킨 본점";
    public Store() {}
    public void info() {
        System.out.println(storeName + "입니다.");

    }
}
