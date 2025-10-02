import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            int pr = r1 + r2;
            int mr = r1 - r2;
            if (mr < 0) {
                mr = mr * -1;
                if (d > mr && d < pr) {
                    System.out.println(2);
                } else if (d == mr && d == pr) {
                    System.out.println(1);
                } else if (d < mr && d > pr) {
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}