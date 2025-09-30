package api.util.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
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
        
        // 5. 값을 얻기
        String name = list.get(3);
        System.out.println("3번째 인덱스 위치한 값: " + name);

        // 6. 값의 삭제
        list.remove(2);
        list.remove("홍길동"); // 첫번째 발견되는 값을 삭제
        System.out.println(list.toString());

        // 7. 값의 포함여부 확인
        if(list.contains("신사임당")) {
            System.out.println("신사임당이 포함되어 있습니다.");
        }

        // 8. 빈 리스트인지 확인
        if(!list.isEmpty() == false) {
            System.out.println("비어있지 않음");
        }

        // 9. 리스트를 추가하기
        // 제네릭<?> - 어떤 타입이든 다 들어갈 수 있음.
        // 제네릭<? extends String> - String의 자식이 들어갈 수 있음
        // 제네릭<? super String> - String의 타입이 될 수 있다면 들어갈 수 있음
        List<String> newList = Arrays.asList("a", "b", "c");
        list.addAll(newList);
        System.out.println(list.toString());
        
    }
}
