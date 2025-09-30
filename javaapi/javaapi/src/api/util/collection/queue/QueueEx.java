package api.util.collection.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        // 자바에서 기본 큐는 LinkedList로 구현합니다.
        Queue<String> queue = new LinkedList<>();

        // add 값 추가
        queue.add("a");
        // offer 값 추가
        queue.offer("b");
        queue.offer("c");

        // 값을 확인하는 메서드
        String value = queue.peek();
        System.out.println("다음번째에 나오는 값은 " + value);

        // 값을 꺼내는 (삭제)
        String v = queue.poll();
        System.out.println("제거된 값: " + v);

        // 현재 큐
        System.out.println(queue.toString());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll()); // 더 이상 꺼낼값이 없으면 null을 반환
        
        // 큐의 반복
        // size()로 사용해도 되고, isEmpty()메서드로 사용할 수 도 있음.
        queue.add("d");
        queue.add("e");
        queue.add("f");
        queue.add("g");
        
        while(queue.isEmpty() == false) {
            System.out.println(queue.poll());
        }
    }
}
