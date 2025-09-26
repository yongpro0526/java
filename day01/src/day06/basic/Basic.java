package day06.basic;

public class Basic {
    
    // 오버로딩 - 같은 이름의 메서드 or 생성자를 여러개 만들 수 있음.
    // 규칙1. 이름이 같음.
    // 규칙2. 반환유형이 다른건 오버로딩이 아님.
    // 규칙3. 매개변수 개수, 유형, 순서를 다르게 하면 됨.
    
    
    void input(int num) {
        System.out.println("정수 1개 입력");
    }
    
//    int input(int num) {
//        return 0;
//    }
    
    void input(int num, String str) {
        System.out.println("정수 1개, 문자열 1개 입력");
    }
    
    void input(String str, int num) {
        System.out.println("문자열 1개, 정수 1개 입력");
    }
    
    void input(String s) {
        System.out.println("문자열 1개 입력");
    }

    Basic() {

    }

    Basic(int num) {

    }
    
}
