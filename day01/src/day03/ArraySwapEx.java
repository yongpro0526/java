package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        int temp = x;
//        x = y;
//        y = temp;
        // 두 수를 입력 받아서 입력받은 두 수 번째의 인덱스 위치를 swap
        int[] arr = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
    }
}

