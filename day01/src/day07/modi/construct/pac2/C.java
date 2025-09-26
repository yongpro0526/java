package day07.modi.construct.pac2;

import day07.modi.construct.pac1.A;

public class C {
    A a = new A(1); // public (O)
//    A a2 = new A(true); // default (X)
//    A a3 = new A("홍길동") // private (X)

    C() {
        a.a = 1;
//        a.b = 2; // default (X)
//        a.c = 3; // private (X)

        a.method01();
//        a.method02(); // default (X)
//        a.method03(); // private (X)
    }


}
