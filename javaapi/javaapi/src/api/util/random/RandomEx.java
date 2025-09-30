package api.util.random;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random ran = new Random();
        int ran1 = ran.nextInt();
        System.out.println("정수 범위의 랜덤 수: " + ran1);

        int ran2 = ran.nextInt(10);
        System.out.println("0 ~ 10의 랜덤 수: " + ran2);

        double ran3 = ran.nextDouble();
        System.out.println("0 ~ 1의 랜덤 수: " + ran3);
    }
}
