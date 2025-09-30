package api.lang;

import java.util.Arrays;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        // util패키지 부터는 import를 사용해야 함.
        int[] arr = {3, 1, 5, 6, 7, 4};

        // 전부 static메서드로 정의가 되어있음.
        // 정렬
        Arrays.sort(arr); // 퀵 sort
        System.out.println(Arrays.toString(arr));

        // 이진탐색 - 선행조건: 정렬
        System.out.println(Arrays.binarySearch(arr, 6)); // 6이 발견되는 위치

        // 배열의 복사
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr)); // 배열의 바로가기가 아닌 완전히 새로운 배열을 만드는 것

        // 배열을 list로 변경하는 기능 ->
        List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.toString());
        
        // 배열의 내부요소 비교
        if(Arrays.equals(arr, newArr)) {
            System.out.println("내부요소가 같음");
        } else {
            System.out.println("내부요소가 같지 않음");
        }
    }
}
