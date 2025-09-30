package day06.overriding.basic02;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동"; // 상속받음
        s1.age = 18; // 상속받음
        s1.studentId = "123123"; // 본인것
        System.out.println(s1.info()); // 오버라이딩
        // 생성자는 상속이 안 됨.

        Teacher t = new Teacher();
        t.name = "이순신";
        t.age = 20;
        t.subject = "수학";
        System.out.println(t.info());

        Employee e = new Employee();
        e.name = " ";
        e.age = 20;
        e.department = " ";
        System.out.println(e.info());
    }
}
