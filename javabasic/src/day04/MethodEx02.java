package day04;

import java.util.Arrays;

public class MethodEx02 {
    public static void main(String[] args) {
        // 자료구조 - 배열을 유의미하게 사용할 수 있도록 변경하는 구조
        //  stack - LIFO(Last In First Out)

        push(10);
        push(20);
        push(30);
        System.out.println(Arrays.toString(arr));
        System.out.println(pop()); // 30
        System.out.println(pop()); // 20
        System.out.println(pop()); // 20
        System.out.println(pop()); // 1

        System.out.println(Arrays.toString(arr));
    }
    static int[] arr = {1};
    static int push(int data) {
        // 배열의 크기가 +1인 배열을 만들고, 데이터를 옮겨담고, 마지막에 푸거
        int[] temp = new int[arr.length + 1];

        // 기존 배열의 값을 temp애 저장함
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        // temp에 마지마막의 data를 추가
        temp[temp.length - 1] = data;
        // arr를 temp로 변경
        arr = temp;
        temp = null; // 삭제
        return data; // 추가 된 데이터를 반환
    }

    static int pop() {
        // 맨 뒤에 데이터를 백업, 크기가 -1인 배열을 만들고, 데이터를 옮겨 담음.
        if(arr.length > 0){
            // 데이터 백업
            int data = arr[arr.length - 1];
            // 크기가 -1인 배열 생성
            int[] temp = new int[arr.length - 1];
            // 데이터를 옮겨담음
            for(int i = 0; i < temp.length; i++){
                temp[i] = arr[i];
            }
            // 기존 배열을 변경
            arr = temp;
            temp = null;
            return data;
        }
        return 0;
    }

}
