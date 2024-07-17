package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int
        int intValue = integer1; // 오토 언박싱
        System.out.println("intValue = " + intValue);

        // int -> Integer
        Integer integer2 = intValue; // 오토 박싱
        System.out.println("integer2 = " + integer2);
    }
}