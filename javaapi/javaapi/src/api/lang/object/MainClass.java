package api.lang.object;

public class MainClass {
    public static void main(String[] args) throws Throwable {
        Person p = new Person("홍길동");
        Person p2 = new Person("홍길동");

        // equals() - 객체의 주소값을 비교해서 true, false를 출력
        System.out.println(p.equals(p2));

        // toString() - 객체 주소를 문자열로(오버라이딩해서 멤버변수 명을 반환할 수 있도록 사용됨.)
        System.out.println(p.toString());

        // hashCode() - 객체의 고유한 주소값을 숫자로 반환
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        // finalize() - 객체가 사라지는 시점에 호출되는 메서드 (deprecated - 없어질 매서드니깐 사용하지 않는걸 권장.)
        p.finalize();
        // finalize는 가비지컬렉터가 호출될때 객체가 사라지게 되는데, 이 순서를 보장하지 않기 떄문에 사용이 권장 되지는 않음)

        Object p3 = p.clone();

        // clone() - 객체자체를 복사해서 반환
        System.out.println(p3.toString());
    }
}