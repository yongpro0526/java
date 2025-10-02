package api.io.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        try {

            Reader in = new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\text.txt");

            while (true) {
                int result = in.read();
                if (result == -1) {
                    break;
                }
                System.out.print((char)result);
            }
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
