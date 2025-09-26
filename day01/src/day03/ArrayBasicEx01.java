package day03;

public class ArrayBasicEx01 {
    public static void main(String[] args) {
        // 배열은 인덱스를 가지고 있어서, 순서대로 값의 접근이 가능
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // i는 인덱스 번호
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // 배열 안에 있는 요소의 합
        }
        System.out.println("배열요소의 합은 " + sum);
    }
}
