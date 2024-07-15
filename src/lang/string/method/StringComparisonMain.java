package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없고, 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        // equalsIgnoreCase(): 대소문자 구분 없이 비교
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        // 사전적으로 얼마나 차이가 나는지
        System.out.println("'a' compareTo 'b': " + "a".compareTo("b")); // -1
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 1
        System.out.println("'b' compareTo 'a': " + "c".compareTo("a")); // 2
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // -13
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); // 0

        System.out.println("str1 start with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 start with 'Java!': " + str1.endsWith("Java!"));

    }
}
