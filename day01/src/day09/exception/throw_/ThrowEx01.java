package day09.exception.throw_;

public class ThrowEx01 {
    public static void main(String[] args) throws Exception {

        try {
            calc(-10);
        } catch (Exception e) {
            System.out.println("예외 발생!");
            throw new Exception(e);
        }

    }
    public static int calc(int a) throws Exception {
        if (a < 0) {
            throw new Exception(); // 예외를 직접 만듬. - try~catch나 throws로 반드시 예외를 처리 해야함.
        }
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        return sum;
    }
}
