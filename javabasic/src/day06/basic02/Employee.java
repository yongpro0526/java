package day06.basic02;

public class Employee extends Person {

    String department;

    @Override // 어노테이션 - 이거 오버라이딩 됐다는 뜻. 기능은 딱히 없음.
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 부서: " + department;
    }

;}
