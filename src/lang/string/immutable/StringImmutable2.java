package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat("java");

        System.out.println("str1 = " + str1); // hello
        System.out.println("str2 = " + str2); // hello java

        // String은 불변 객체이기 때문. (따라서 변경이 필요한 경우, 기존 값 변경이 아닌 새로운 결과를 만들어서 반환함)
    }
}
