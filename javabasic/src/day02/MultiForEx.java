package day02;

import java.util.Scanner;

public class MultiForEx {
    public static void main(String[] args) {
        // 입력 받은 수 까지의 정수 중에서 소수의 합계
        // 소수는 약수가 1과 자기 자신밖에 없는 수

        Scanner sc = new Scanner(System.in);
        System.out.print("입력>");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            // 각 i의 약수의 개수
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 2){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
