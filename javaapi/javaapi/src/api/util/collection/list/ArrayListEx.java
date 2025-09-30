package api.util.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        // 위보단 아래쪽이 사용 권장. 결과는 똑같음.

        // 1. 추가하기
        list.add("홍길동");
        list.add("이순신");
        list.add("홍순자");
        list.add("신사임당");
        list.add("홍길동");

        System.out.println(list.toString());

        // 2. 크기확인
        System.out.println("크기: " + list.size());

        // 3. 중간에 추가
        list.add(2, "전학생");
        System.out.println(list.toString());

        // 4. 값의 수정
        list.set(2, "모범생");
        System.out.println(list.toString());
    }
}
