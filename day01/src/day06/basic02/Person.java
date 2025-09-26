package day06.basic02;

public class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this);
    }
    
    Person(String name) {
        this(name, 0);
    }
    
    Person() {
        this("이름없음", 0);
    }
    
    String info() {
        return "이름: " + name + ", 나이: " + age;
    }
}
