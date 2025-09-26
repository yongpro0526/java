package day09.exception.trycatch;

public class TryCatchEx03 {
    public static void main(String[] args) {
        try {
            String a = args[0];
            String b = args[1];
            // 문자를 숫자로.
            int result1 = Integer.parseInt(a);
            int result2 = Integer.parseInt(b);
            System.out.println(result1 + result2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("프로그램 실행 매개값을 전달해 주세요.");
        } catch (NumberFormatException | NullPointerException e) { // | 로 연결하면, 두 가지 예외를 동시에 처리 가능함.
            System.out.println("매개값을 정수로 입력하세요.");
        } catch (Exception e) { // 모든 예외 클래스의 부모 클래스이기 때문에, 나머지 모든 예외를 처리할 수 있음.
            System.out.println("기타 예외 입니다.");
        }
        // 에러의 종류별로 catch 구문을 넣기.
    }
}
