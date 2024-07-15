package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {

        // int, double, boolean -> 소문자 => primitive type (기본형
        // String -> 대문자 => 객체, reference type (참조형)
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);

        /*
        오른쪽에 객체를 넣지 않고 이렇게 문자열(리터럴)로 넣어도, 문자열은 자주 사용되기 때문에
        자바에서는 자동으로 객체로 변환해줌 (new String("hello3") 이런 식으로)
        */
        String str3 = "hello3";

    }
}
