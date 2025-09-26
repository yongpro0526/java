package day04;

public class MethodEx01 {
    public static void main(String[] args) {
        // 메서드는 클래스 안, main의 밖에 만들어야 함.
        hello();
        some(1, 2); // 매개변수를 넣어줘야함.
        int result = sum();
        System.out.println(result);

        String result2 = ranString(10, "hi");
        System.out.println(result2);

        sayHello("bye"); // return 키워드를 만나서 종료됨.
        sayHello("hello");
    }

    // 매개변수가 없고, 반환이 없는 메서드
    static void hello() {
        System.out.println("hello");
    }

    // 매개변수는 있고, 반환은 없는 매서드
    static void some(int a, int b) {
        System.out.println(a + b);
    }

    // 매개변수는 없고, 반환은 있는 매서드
    static int sum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        // 반드시 return키워드에 반환한 값을 넣어야함.
        return sum;
    }

    static String ranString(int a, String b) {
        String sum = "";
        for (int i = 1; i <= a; i++) {
            sum += b;
        }
        return sum;
    }

    static void sayHello(String str) {
        // 반드시 hello문자열이 전달되어야 하는 메서드
        // hello 문자열이라면 true, 아니면 false
        if(!str.equals("hello")){
            System.out.println("hello 문자열을 넘겨주세요");
            return;
        }
        System.out.println(str);
    }
}
