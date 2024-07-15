package lang.immutable.address;

public class ImmutableAddress {

    // 불변 객체 (값이 절대 바뀌면 안 됨 / set도 없음)
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
            "value='" + value + '\'' +
            '}';
    }
}
