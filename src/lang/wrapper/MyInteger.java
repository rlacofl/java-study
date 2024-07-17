package lang.wrapper;

public class MyInteger {

    // 기본형 변수
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
//        return "" + value;
        return String.valueOf(value); // 숫자를 문자로 변경
    }


}
