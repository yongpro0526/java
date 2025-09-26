package day02;

import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0을 입력할때까지, 입력받은 수들의 합계
        // 무한 반복문
        int sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num==0) break; // 제어문은 코드가 한 줄이면 {} 생략가능
            sum += num;
        }
        System.out.println("입력받은 수의 합은 " + sum + "이다.");
    }
}
