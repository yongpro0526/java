package day09.exception.thorows_;

import java.io.FileInputStream;

public class ThrowsEx01 {
    public static void main(String[] args) {
        /*
        throws 키워드는 메서드나 생성자에서 예외를 떠넘기는 방식.
        throws 키워드를 만나면 예외가 호출부로 넘어감.
        즉, 예외처리를 강조할 때 사용함.
        */

        try {
            greeting(5);
        } catch (Exception e) {
            System.out.println("예외가 발생 했습니다.");
            e.printStackTrace(); // 예외의 원인을 출력하는 기능 - 개발시에 매번 사용됨.
        }

        // throws의 대표적인 예시
        try {
            Class.forName("%^*^%*^&");

        } catch (ClassNotFoundException e) {

        }

        try {
            new FileInputStream("sdf");
        } catch (Exception e) {

        }


        System.out.println("프로그램 정상 종료");
    }

    public static String[] arr = {"hello", "hi", "bye"};
    public static void greeting(int index) throws Exception {
        System.out.println(arr[index]);
    }
}
