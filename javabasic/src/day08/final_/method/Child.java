package day08.final_.method;

public class Child extends Parent {
//    public void method01() {}

    // final변수는 변경 금지라는 의미 - 값을 반드시 초기화 해야 함.
    public final String nation = "한국";
    public final String ssn;

    public Child(String ssn) {
        this.ssn = ssn;
    }

}
