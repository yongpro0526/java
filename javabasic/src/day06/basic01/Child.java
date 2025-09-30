package day06.basic01;

public class Child extends Parent {
    // 생성자 첫째줄에 super가 들어가야 하는데, 아무것도 적지않으면 super가 기본으로 들어감
    Child(String father, String mother) {
        super(father, mother);
    }
}
