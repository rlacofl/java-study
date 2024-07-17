package lang.wrapper;

// 오토 박싱, 오토 언박싱
public class AutoboxingMain1 {

    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
//        Integer boxedValue = Integer.valueOf(value); // 명시적으로 int를 Integer 객체로 변환하는 전통적인 방법
        Integer boxedValue = value; // Auto-boxing (오토 박싱)

        // Wrapper -> Primitive
//        int unboxedValue = boxedValue.intValue(); //  명시적으로 Integer 객체에서 int 값을 추출하는 전통적인 방법
        int unboxedValue = boxedValue; // Auto-unboxing (오토 언박싱) // 컴파일러가 자동으로 Integer 객체에서 int 값을 추출

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
