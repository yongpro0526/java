package api.ramda.basic2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainClass01 {
    public static  void main(String args[]) throws Exception
    {
        List<String> list = Arrays.asList("홍길동", "이순신", "홍길자");
        // 외부에서 반복자

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        // 람다스트림이 제공하는 내부 반복자 방식
//        Stream<String> stream = list.stream();
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // 위랑 아래랑 같은 의미임.
        list.stream().forEach(s -> System.out.println(s));
    }
}
