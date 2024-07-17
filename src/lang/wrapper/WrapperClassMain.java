package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        // 래퍼 클래스 생성 - 박싱(Boxing)
        Integer newInteger = new Integer(10); // 삭제 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); // 위에 코드랑 동일
        // ㄴ> -128 ~ 127 사이의 값은 캐시로 관리되기 때문에 new 로 만드는 것보다 효율적 (성능 최적화)

        Long longObj = Long.valueOf(100); // Long 객체 생성
        Double doubleObj = Double.valueOf(10.5); // Double 객체 생성

        // intValue() - 언박싱(Unboxing): 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드
        // equals() - 래퍼 클래스는 객체이기 때문에 == 비교를 하면 참조값을 비교하게 됨. 따라서 equals() 사용


        // toString 존재
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));
    }
}
