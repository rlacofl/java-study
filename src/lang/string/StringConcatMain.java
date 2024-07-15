package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println(result1);
        System.out.println(result2);

        // 자바에서 문자열은 너무 자주 다루어지기 때문에 concat() 메서드 대신에 + 연산자를 사용해도 무방
    }
}
