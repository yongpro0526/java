package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
    public static void main(String[] args) {
        // 이름에 buffered가 붙었으면, 성능향상 보조 스트림임.
        // BufferedWriter
        // BufferedReader
        // BufferedInputStream
        // BufferedOutputStream
        try {
            Scanner sc = new Scanner(System.in);
            // Writer out = new FileWriter("경로");
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\upload\\bye.txt"));

            while(true){
                String str = sc.nextLine();
                if(str.equals("그만")) {
                    break;
                }
                out.write(str);
                out.flush();
            }
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
