package day06.inherit.good;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동"; // 상속받음
        s1.age = 18; // 상속받음
        s1.studentId = "123123"; // 본인것
        System.out.println(s1.info()); // 상속받음
        // 생성자는 상속이 안 됨.
    }
}
