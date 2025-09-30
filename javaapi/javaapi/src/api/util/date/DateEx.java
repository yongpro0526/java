package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        // 사람이 보기 편한 형태의 문자열로 포맷됨
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(date);
        System.out.println("현재시간: " + now);

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(sdf.format(date));
    }
}
