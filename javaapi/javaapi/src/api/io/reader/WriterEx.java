package api.io.reader;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {
        // writer, reader 이름을 사용하는 클래스는 2byte기반으로 읽고 쓰는 클래스

        try {
            Writer out = new FileWriter("C:\\Users\\user\\Desktop\\course\\upload\\text.txt", true);
            // 기존에 있건 파일에 문자열을 추가하고 싶으면? - 생성자 두번째 매개변수에 true
            String str = "오늘은 수요일 입니다~!\n집에 가자!!\n";
            out.write(str);
            // 버퍼 - flush() or close()를 이용해서 모아놓은 데이터를 내보내는 작업을 해야함.
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
