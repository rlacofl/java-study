package lang.immutable.change;

// 불변 객체
public class ImmutableObj {

    private final int value;  // 절대 바뀌면 안됨

    public ImmutableObj(int value) {
        this.value = value;
    }

    /*
    Immutable인데 값을 변경해야하는 상황이 온다면, '새로 객체를 만들어서 반환하겠네' 라고 생각하기
    */

    // 기존 값에서 새로운 값을 더하는 메서드
    public ImmutableObj add(int addValue) {
//        value = value + addValue;  // 불변으로 만들것이기 때문에 이거 안됨
        int result = value + addValue;

//        ImmutableObj immutableObj = new ImmutableObj(30);
//        return immutableObj;

        // 본인을 바꾸지 않고, 새로운 객체를 만들어서 반환하는 방식
        return new ImmutableObj(result);
    }

    // final이라 setter는 불가능
    public int getValue() {
        return value;
    }
}
