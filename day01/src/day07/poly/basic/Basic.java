package day07.poly.basic;

// 하나의 자바파일에 여러 클래스를 선언할 수 있음.
// 단, public 클래스는 하나여야하고, public 클래스는 파일명과 동일한 클래스여야함.
class A {

}

class B extends A {

}

class C  extends A {

}

class D extends B {

}

class E extends C {

}

public class Basic {
    // 다형성 - 자식 객체가 부모타입에 저장 될 수 있는 특징
    A a = new A();
    A b = new B();
    A c = new C();
    A d = new D();
    A e = new E();

    int i = 1;
    double dd = i;

    // 상속관계가 아니라면, 다형성은 적용되지 않음.
//    B bb = new E();

    // Object에는 모든 클래스가 다 저장될 수 있음.
    Object o1 = 1;
    Object o2 = "문자열";
    Object o3 = new A();
    Object o4 = new B();
}