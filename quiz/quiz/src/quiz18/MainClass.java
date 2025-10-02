package quiz18;

import quiz04.Book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        // 1. Random클래스를 활용해서 1~45의 랜덤한 번호를 생성
        // 2. Set을 이용해서 6개의 고유한 로또번호를 만들어내는 프로그램코드 작성해보세요.

        Random ran = new Random();
        Set<Integer> number = new HashSet<>();
        while (number.size() < 6) {
            int num = ran.nextInt(45) + 1;
            number.add(num);
        }
        System.out.println(number.toString());
    }
}
