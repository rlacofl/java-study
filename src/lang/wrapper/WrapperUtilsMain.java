package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10");// 문자열 전용, 기본형 변환 (문자 -> 숫자)
        // valueOf("10"): 래퍼 타입 반환 / parseInt("10"): 기본형 반환
        // 비교 (비교 연산자 제공)
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult); // -1
        // 내 값이 크면 1, 작으면 -1, 같으면 0

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
