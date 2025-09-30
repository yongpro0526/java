package day06.basic02;

public class Student extends Person {

    String studentId; // 학생의 고유기능

    String info() {
        return "이름: " + name + ", 나이: " + age + ", 학번: " + studentId;
    }

}
