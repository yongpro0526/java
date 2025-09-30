package api.lang.wrapper;

import com.sun.security.jgss.InquireType;

public class BoxingEx {
    public static void main(String[] args) {
        int a = 100;
        double b = 3.14;
        char c = 'a';

        // boxing
        // int를 객체형으로 변환
        Integer i1 = new Integer(a);
        System.out.println(i1);

        // unboxing
        // 객체형을 int로 변환
        Integer val1 = a;
        Double val2 = b;
        Boolean val3 = true;
        Character val4 = c;

        // 기본타입과 wrapper타입의 차이점 = 초기값
        // 기본 int타입은 null을 가질 수 없지만, wrapper Integer는 null을 가질 수 있다.
//        int x = null;

        System.out.println("--------------------");
        // 래퍼클래스의 주된 기능 static 메서드로 사용함
        int r1 = Integer.parseInt("5");
        double r2 = Double.parseDouble("3.14");
        long r3 = Long.parseLong("33");

        System.out.println(r1 + r2 + r3);

        System.out.println(Integer.MAX_VALUE); // int의 가장 큰 값
        System.out.println(Integer.max(3, 5)); // 큰 값 반환
    }
}
