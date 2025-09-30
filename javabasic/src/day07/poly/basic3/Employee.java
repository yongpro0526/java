package day07.poly.basic3;

public class Employee extends Person {
    String department;

    // Alt + Insert
    Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    String info() {
        return super.info() + ", 부서: " + department;
    }

}
