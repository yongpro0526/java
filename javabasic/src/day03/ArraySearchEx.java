package day03;

import java.util.Arrays;

public class ArraySearchEx {
    public static void main(String[] args) {
        // 이분할 탐색(이진탐색)
        // 선행조건 - 반드시 정렬 되어 있어야 함.
        int[] arr = {1, 3, 4, 5, 10, 20, 25, 50, 80, 100};

        int find = 23;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == find) {
                System.out.println("찾는 값은 " + mid + "번째에 있습니다.");
                break;
            } else if (arr[mid] < find) {
                start = mid + 1;
            } else if (arr[mid] > find) {
                end = mid - 1;
            }
        }
        if (start > end) {
            System.out.println("찾는 값은 없습니다.");
        }
        // 찾는 값이 있으면 해당 인덱스를 알려줌, 없으면 음수값
        System.out.println(Arrays.binarySearch(arr, 25));
    }
}
