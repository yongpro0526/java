package quiz20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        // 민경이가 입사한 회사에서는 매일 오전 7시에 연계회사에서 날짜유형의 csv파일을 전송을 해준다.
        // 파일의 이름은 2025_10_01_data.csv 이다.
        // 그래서 민경이는 아침마다 csv파일을 읽어서 가져오는 작업을 해야한다.
        // Date 클래스를 활용해서 오늘 날짜 기준의 파일을 읽고, [, ] 기준으로 분리한 다음에 나이와 이름을 출력.

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
        String now = sdf.format(date);
        try {
            String path = "C:\\Users\\user\\Desktop\\course\\upload\\" + now + "_data.csv";
            BufferedReader br = new BufferedReader(new FileReader(path));

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                String[] arr = str.split(", ");
                System.out.println("나이: " + arr[0] + ", 이름: "  + arr[1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
