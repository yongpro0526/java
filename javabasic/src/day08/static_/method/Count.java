package day08.static_.method;

public class Count {

    public int a;
    public static int b;

    //일반 메서드 - 일반멤버, 정적멤버 둘 다 접근 가능
    public void method01() {
        a = 10;
        b++; // 사용가능
    }

    // 정적 메서드 - 같은 static 멤버만 접근 가능
    // 단, static멤버가 아니더라도 객체를 생성해서 접근하는건 가능함.
    public static void method02() {
        b++;
//        a = 10;
        Count c = new Count();
        c.a = 10;
    }
}
