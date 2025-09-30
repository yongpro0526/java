package day03;

import java.util.Arrays;

public class ArraySortEx {
    public static void main(String[] args) {
        // 정렬 - 선택 정렬 (가장 작은 값을 앞으로 가져옴)
        int[] arr = {5, 23, 1, 43, 200, 100, 40};
        // 첫번째 - 1, 23, 5, 43, 200, 100, 40
        // 두번째 - 1, 5, 23, 43, 200, 100, 40
        // 세번째 - 1, 5, 23, 43, 200, 100, 40
        // 네번째 - 1, 5, 23, 40, 200, 100, 43

//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
