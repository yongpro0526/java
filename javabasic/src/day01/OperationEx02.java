package day01;

public class OperationEx02 {
    public static void main(String[] args) {
        int i = 10 / 3; //
        System.out.println(i); // 3
        System.out.println(10 % 3); // 1
        System.out.println(1 * 10); // 10

        // 비교 연산자
//        System.out.println(i == j); // f
//        System.out.println(i != j); // t
//        System.out.println(i >= j); // t
//        System.out.println(i <= j); // f

        // 비트 연산자
        int a = 192;
        System.out.println(a << 3);

        // 대입 연산자
        int num = 1;
        num += 1; // 4, num = num + 3;
        num -= 1; //  3
        num *= 10; // 30
        num /= 2; // 15
        num %= 2; // 1
        System.out.println(num);

        // 논리 연산자
        // &, | 는 무조건 뒤의 코드를 실행
        // &&, || 는 만족하지 않는 조건이라면, 뒤의 코드를 실행하지 않음.
        int x = 10;
        int y = 20;
        System.out.println(x != 10 && ++y == 21);
        System.out.println("x: " + x + ", y: " + y);
        System.out.println(x == 10 || ++y == 21);
        System.out.println("x: " + x + ", y: " + y);
    }
}
