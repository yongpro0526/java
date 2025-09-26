package quiz08;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("123123", "집");
        Person person = new Person("이", phone);
        person.getPersonInfo();
    }
}
