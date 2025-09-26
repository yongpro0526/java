package quiz14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        /*
        업, 다운 게임
        1 ~ 100까지 랜덤한 정답을 만들고, 사용자에게 정답을 맞출때 까지 입력받는 프로그램.
        한글을 입력하더라도 정상적으로 돌아갈 수 있도록 예외처리를 진행합니다.
        한글을 입력하면 무한루프를 돌게 되는데, 해결방법 찾기.
        */

        Scanner sc = new Scanner(System.in);
        int correct = (int)(Math.random() * 100 + 1);
        int count = 0;
        int answer = 0;

        while(answer != correct){

            System.out.print("1부터 100까지의 수를 입력하세요>");
            try {
                answer = sc.nextInt();
                count++;
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요.");
                sc.nextLine();
                continue;
            }

            if(answer == correct){
                System.out.println("정답입니다. " + count + "번 만에 맞히셨습니다.");
            } else {
                if(answer > correct){
                    System.out.println("다운");
                } else {
                    System.out.println("업");
                }
            }
        }
    }
}
