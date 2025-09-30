package day01;

public class CastingEx01 {
    public static void main(String[] args) {
        // 자동 형변환 - 크기가 작은 타입을 
//        byte n = 10;
//        int a = b; // 자동 형변환
//        long l = b; // byte -> long 자동 형변환

        char s = '가';
        int i = s; //chat -> int
        System.out.println(i);
        
        // 명시적 형변환 - 큰 타입을 작은 타입으로 넣을때 (type)으로 변환함
        int k = 70;
        char c = (char)k;
        System.out.println(c);

        float f = (float)k;
        System.out.println(f);

        // 명시적 변환시에 값을 저장할 수 없는 범위가 들어오면 잘린 값이 저장됨.
        // 예시 100011100 > 맨 뒤 4글자인 1100만 저장.
        int j = 1000;
        byte b1 = (byte)j;
        System.out.println(b1);
    }
}