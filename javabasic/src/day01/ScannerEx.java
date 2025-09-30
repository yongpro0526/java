package day01;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // 스캐너 생성
        Scanner scan = new Scanner(System.in);

        // 스캐너가 제공하는 함수를 이용해서 입력받음
        // next() - 문자열 입력 - 공백 앞 까지만
        // nextLine() 문자열 입력 - 공백 포함해서
        // nextInt() - 정수 입력
        // nextDouble() - 실수 입력
        System.out.print("이름을 입력해봐>");
        String name = scan.next();

        System.out.print("나이를 입력해봐>");
        int age = scan.nextInt();

        System.out.println("이름: " + name + ", 나이: " + age);

        // 스캐너가 사용한 통로를 닫음(자원 반납)
        scan.close();
    }
}
