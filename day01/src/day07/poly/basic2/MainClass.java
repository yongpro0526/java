package day07.poly.basic2;

public class MainClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.method01(); // 상속받은 메서드
        c.method02(); // 오버라이딩된 메서드
        c.method03(); // Child의 메서드

        // 다형성 적용
        Parent p = c;
        System.out.println(c);
        System.out.println(p);
        // Parent에 있는 기능만 사용가능. 단, 오버라이딩 되었다먄, 오버라이딩 된 메서드가 실행됨.
        p.method01();
        p.method02();

        // 다형성이 적용되면, 원래 멤버에 접근할 수 없어지는 문제가 있다.
        // 그래서 클래스를 다시 형변환 할 수 있다.
        System.out.println("--------------------------------------");
        Child cc = (Child)p;
        cc.method01();
        cc.method02();
        cc.method03();
        // 주의 할 점. - 본래 자식으로 만들어지는 객체만, 다시 자식클래스로 변환활 수 있음.
        // 예외
//        Perent pp = new Parent();
//        Child ccc = (Child)pp;

    }
}
