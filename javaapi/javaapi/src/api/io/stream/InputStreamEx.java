package api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {

        // InputStream은 1바이트 기반이기 때문에 텍스트 데이터를 읽거나 쓰는데는 한계점이 있음.
        // 그래서 주로 파일 데이터를 읽고 쓰는데 사용함.
        try {
            // 바로 선언
            InputStream in = new FileInputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");
            while(true){
                int a = in.read();
                if(a == -1){
                    break;
                }
                System.out.print((char)a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
