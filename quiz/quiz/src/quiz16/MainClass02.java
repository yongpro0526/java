package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
    public static void main(String[] args) {
        // 1. User클래스를 저장할 수 있는 ArrayList선언
        List<User> list = new ArrayList<>();

        // 2. User 객체를 2개 생성해서 List에 추가하세요.
        System.out.println("====2번====");
        User u1 = new User("홍길동", 30);
        User u2 = new User("홍길자", 20);
        list.add(u1);
        list.add(u2);
        System.out.println(list.toString());

        // 3. list에 저장된 모든 이름, 나이를 for문으로 출력, 향상된 for문으로 출력
        System.out.println("====3-1번====");
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String name = u.getName();
            int age = u.getAge();
            System.out.println("이름: " + name + ", 나이: " + age);
        }

        System.out.println("====3-2번====");
        for (User u : list) {
            System.out.println("이름: " + u.getAge() + ", 나이: " + u.getAge());
        }

        // 4. list에 "홍길자"가 있다면, 홍길자의 이름, 나이만 출력
        System.out.println("====4번====");
        for (User u : list) {
            if (u.getName().equals("홍길자")) {
                System.out.println("이름: " + u.getName() + ", 나이: " + u.getAge());
            }
        }

        // 5. list에 "홍길동"이 있다면, 객체를 삭제.
        System.out.println("====5번====");
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getName().equals("홍길동")) {
                list.remove(i);
                break;
            }
        }
    }
}
