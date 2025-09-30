import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for(char i = 'a'; i < 'z'; i++) {
            System.out.print(S.indexOf(i) + " ");
        }
        System.out.print(S.indexOf('z'));
    }
}
