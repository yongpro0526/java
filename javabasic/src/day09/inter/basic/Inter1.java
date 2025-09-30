package day09.inter.basic;

// 객체를 생성할 수 없음.
// A a = new A; << 이거 안 된다는 뜻
public interface Inter1 {
    // 상수와 추상메서드를 가질 수 있음.
    double PI = 3.141592; // 자동으로 상수가 됨. / 꼭 값을 선언해야함.
    void method01(); // 자동으로 추상메서드가 됨. / 중괄호 불가
}
