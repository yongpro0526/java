package api.lang.string;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        String str2 = new String(arr); // 문자열은 문자배열의 합으로 만들어짐.
        System.out.println(str2);

        String str = "hello world";
        // 문자열 한글자 자르기
        char r1 = str.charAt(0);
        System.out.println(r1);

        // 문자열 길이
        System.out.println(str.length());

        // 문자열 비교
        System.out.println(str.equals("hello world"));

        // 특정 문자 위치로 자르기
        System.out.println(str.substring(5)); // 5미만 인덱스 절삭, o까지 짜름. %20부터 출력 
        System.out.println(str.substring(5, str.length())); // 5이상 ~ 길이 미만 추출
        
        // 공백제거
        System.out.println(str.trim()); // 앞뒤 공백 제거

        // 대소문자 바꾸기
        str = "Hello World";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // 문자열 찾기
        System.out.println(str.indexOf("l")); // 앞에서부터 l의 위치
        System.out.println(str.lastIndexOf("l")); // 뒤에서부터 l의 위치
        System.out.println(str.contains("Hel")); // Hel 문자열이 있으면 true

        // 문자열 변경
        System.out.println(str.replace("l", "헑")); // l을 헑으로 바꿈
        System.out.println(str.replaceFirst("l", "헑")); // 첫번째 l을 헑으로 바꿈
        // 원본 문자열은 그대로!

        // 문자열을 골라서 배열로 반환
        String[] arr2 = str.split("");
        System.out.println(Arrays.toString(arr2));

        str = "010-1234-5678";
        String[] arr3 = str.split("-");
        System.out.println(Arrays.toString(arr3));

        // 문자열의 대소비교
        System.out.println("코끼리".compareTo("사자")); // 각 글자를 비교해서 같지 않으면 종료, 양수가 나오면 앞 문자열이 사전적으로 뒤에있음.
        System.out.println("사자".compareTo("코끼리"));
        System.out.println("홍길동".compareTo("홍길동"));
    }
}
