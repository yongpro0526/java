package day06.basic02;

public class Teacher extends Person {

    String subject; // 선생의 고유기능

    @Override // 어노테이션 - 이거 오버라이딩 됐다는 뜻. 기능은 딱히 없음.
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
    }
}
