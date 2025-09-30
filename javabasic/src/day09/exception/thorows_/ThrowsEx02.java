package day09.exception.thorows_;

public class ThrowsEx02 {
    public ThrowsEx02() throws Exception {
        aaa();
    }
    public void aaa() throws Exception {
        System.out.println(1 / 0);

    }

//    public static void main(String[] args) /* throws Exception */ { // main에서는 웬만하면 throws말고 try-catch를 사용할 것
//        ThrowsEx02 ex = new ThrowsEx02();
//    }
}
