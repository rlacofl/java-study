package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        // values = [BASIC, GOLD, DIAMOND]
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            // name(): enum 이름 반환 / ordinal(): enum 순서 반환 (순서대로)
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // ordinal()은 가급적 사용하지 않는 것이 좋음

        // String -> ENUM 변환 (잘못된 문자가 들어갈 경우 예외 발생)
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩

    }
}
