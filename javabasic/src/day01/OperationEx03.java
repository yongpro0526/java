package day01;

public class OperationEx03 {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println(d); // 0 < d < 1인 랜덤 실수
        int ran = (int)(d * 10); // 0 < ran < 10인 수
        System.out.println(ran);

        String result = ran >= 5 ? "5이상" : "5이하";
        System.out.println(result);

        // 1 ~ 100까지 랜덤한 정수를 만들고, 랜덤 수가 홀수인지 짝수인지 출력하세요.

        int ran1 = (int)(Math.random() * 100 + 1);
        String result1 = ran1 % 2 == 1 ? "홀수" : "짝수";
        System.out.println(ran1 + "은(는) " + result1 + "이다.");
    }
}
