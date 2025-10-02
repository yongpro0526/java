package api.io.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStreamEx {
    public static void main(String[] args) {

//        FileOutputStream out = new FileOutputStream();
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");
            String str = "Hello World!";
            out.write(str.getBytes()); // byte기반으로 파일을 써내임

        } catch (Exception e) {

        } finally {
            try {
                out.close();
            } catch (Exception e) {

            }

        }

    }
}
