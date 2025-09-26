package day07.modi.construct.pac1;

public class B {
    // 멤버변수
    A a = new A(1); // public (O)
    A a2 = new A(true); // default (O)
//    A a3 = new A("홍길동") // private (X)

    B() {
        // 객체 생성
        a.a = 1;
        a.b = 2;
//        a.c = 3; // private (X)

        a.method01();
        a.method02();
//        a.method03(); // private (X)
    }


}
