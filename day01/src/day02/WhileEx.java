package day02;

public class WhileEx {
    public static void main(String[] args) {

        // 1 ~ 10의 수 중에서 짝수의 개수 구하기
        int count = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("1에서 10까지의 짝수의 개수는 " + count + "개 이다.");
    }
}
