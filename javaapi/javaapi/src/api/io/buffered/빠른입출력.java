package api.io.buffered;

import java.io.*;

public class 빠른입출력 {
    public static void main(String[] args) {
        // 입출력의 정석
        try {

            // 빠른 입력
            Reader rd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(rd);

            System.out.println("입력해봐!");
            String str = br.readLine();
            System.out.println(str);

            // 빠른 출력
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(str);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
