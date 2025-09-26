package day09.exception.trycatch;

public class TryCatchEx01 {
    public static void main(String[] args) {

        // NullPointerException
        // String str = null;
        // str.concat("abc");

        // ArrayIndexOutOfBoundsException
        // int[] arr = new int[5];
        // arr[5] = 100;

        try {
            // NumberFormatException
            int result = Integer.parseInt("!$@#%$!@#%@");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 예외의 기본 메시지를 출력
        }

        
        System.out.println("프로그램 정상종료!");
    }
}
