package day07.poly.basic3;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 20, "123123");
        Student s2 = new Student("이순신", 10, "555555");
        Student s3 = new Student("홍길자", 30, "444444");
        Teacher t1 = new Teacher("영자", 30, "수학");
        Teacher t2 = new Teacher("홍길자", 30, "과학");
        Employee e1 = new Employee("철수", 50, "회계");

        //
        Person[] arr = {s1, s2, s3, t1, t2, e1};

        for (Person p : arr) {
            System.out.println(p.info());
        }

        // 매개변수에 적용될 수 있는 다형성
        House house = new House();
        house.personInfo(s1);
        house.personInfo(s2);
        house.personInfo(s3);
        house.personInfo(t1);
        house.personInfo(t2);
        house.personInfo(e1);

        house.personsInfo(arr); // Person배열

        printPerson(s1);
        }
    public static void printPerson(Person p) {

        if (p instanceof Employee) {// Employee 타입이면 true, 아니면 false, true면 출력 한다는 뜻.
            Employee e = (Employee) p;
            System.out.println(e.info());
        } else if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            System.out.println(t.info());
        }  else if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println(s.info());
        }
    }
}
