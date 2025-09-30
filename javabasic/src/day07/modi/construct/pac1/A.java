package day07.modi.construct.pac1;

// 클래스의 접근 제어자는 public 혹은 default(붙이지 않는거)만 가능
public class A {
    public A(int i) {

    }
    A (boolean b) {

    }
    private A (String s) {

    }

    // 멤버변수 or 메서드에 접근제한자 붙이기
    public int a = 1;
    int b = 2;
    private int c = 3;

    public void method01() {

    }
    void method02() {

    }
    private void method03() {

    }
}