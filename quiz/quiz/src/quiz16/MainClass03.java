package quiz16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass03 {
    public static void main(String[] args) {
        // 메뉴를 입력받고, 메뉴에 따라서 기능을 구현.

        Scanner sc = new Scanner(System.in);

        // 0. 유저를 저장할 수 있는 List선언
        List<User> list = new ArrayList<>();

        while (true) {
            System.out.println("[1. 회원추가, 2. 회원찾기, 3. 회원삭제]");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                // 이름과 나이를 입력받아서 list에 추가
                System.out.print("이름> ");
                String name = sc.nextLine();
                System.out.print("나이> ");
                int age = sc.nextInt();

                list.add(new User(name, age));
            } else if (menu == 2) {
                // 이름을 입력받아서, 이름이 있으면 정보를 출력, 없으면 "찾는 회원은 없습니다." 출력
                System.out.print("찾을 이름> ");
                String s = sc.nextLine();
                boolean b = false;
                for (User u : list) {
                    if (u.getName().equals(s)) {
                        System.out.println("이름: " + u.getName() +", 나이: " + u.getAge());
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    System.out.println("찾는 회원은 없습니다");
                }
            } else if (menu == 3) {
                // 삭제할 이름을 입력받아서, 있으면 삭제, 없으면 "삭제할 회원이 없습니다." 출력
                System.out.print("삭제할 이름> ");
                String d = sc.nextLine();
                boolean b = false;
                for (int i = 0; i < list.size(); i++) {
                    User u = list.get(i);
                    if (u.getName().equals(d)) {
                        list.remove(i);
                        b = true;
                        break;
                    }
                }
                if(!b) {
                    System.out.println("삭제할 회원이 없습니다.");
                }
            }
        }
    }
}
