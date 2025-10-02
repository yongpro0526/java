package api.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {
    public static void main(String[] args) {

        /*
        * [0-9] 0~9 의 숫자
        * [A-Z] A~Z 의 문자
        * [A-Za-z] 대문자 소문사 사이의 문자
        * [가-힣] 한글문자
        * {3} - 정확히 3개
        * {3, 4} - 3개 이상 4개 이하
        * {3, ) - 3개 이상
        *
        * \\w - _와 영어, 숫자
        * \\d - 숫자
        * ? - 0번 ~ 1번
        * + - 1회 이상
        * */



        String info = "30/홍길동/경기도/010-1234-5678/010-4444-4444/kkk123@naver.com";
        String patten = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
        Pattern p = Pattern.compile(patten);
        Matcher m = p.matcher(info);

//        System.out.println(m.find());
        while (m.find()) {
            System.out.println("일치하는 문자의 시작 인덱스: " + m.start());
            System.out.println("일치하는 문자의 끝 인덱스: " + m.end());
            System.out.println("일치하는 문자: " + m.group());
        }

        System.out.println("---");

        String email = "\\w+@\\w+.\\w+";

        Matcher m2 = Pattern.compile(email).matcher(info);
        while (m2.find()) {
            System.out.println(m2.group());
        }



    }
}
