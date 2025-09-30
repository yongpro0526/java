package day01;

public class DataTypeEx {
    public static void main(String[] args) {
        byte b = 127;
        byte b2 = -128;

        short s = 32767;

        int i = 2147483647;

        long l = 1135421635748536312L; // 맨 뒤에 L을 붙여줘야함

        // 2진수, 8진수, 16진수 형태로도 저장이 됨.
        // 2진수 - 맨 앞에 0b를 붙임.
        // 8진수 - 맨 앞에 0을 붙임.
        // 16잔수 - 맨 앞에 0x를 붙임.
        int i2 = 01010; // 520, 8진수임.

        float f = 3.1415926535f;
        double d = 3.1415926535;

        System.out.println(f);
        System.out.println(d);

        boolean b1 = true; // false 둘 중 하나만 가능

    }
}
