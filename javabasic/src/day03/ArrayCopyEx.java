package day03;

import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        // 복사
        // 얕은 복사 - 주소값을 복사(원본값이나 복사된 값 중 하나가 변경되면 다른 값도 함께 변경됨)
        // 복사말고 바로가기라고 생각하면 편할듯?
        // 깊은 복사 - 완전히 새로운 배열을 하나 생성
        int[] arr = {10, 20, 30, 40, 50};

        // 얕은 복사
        int[] newArr = arr;
        newArr[0] = 100;
        arr[4] = 500;

        // 깊은 복사
        int[] newArr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr2[i] = arr[i];
        }
        System.out.println("사본 배열: " + Arrays.toString(newArr2));

        int[] newArray3 = Arrays.copyOf(arr, arr.length);
        System.out.println("사본 배열: " + Arrays.toString(newArray3));
    }
}
