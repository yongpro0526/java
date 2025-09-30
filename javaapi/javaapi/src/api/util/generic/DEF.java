package api.util.generic;

public class DEF<T> { // T타입은 아직 정해지지 않음(객체 생성 시 지정함)
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
