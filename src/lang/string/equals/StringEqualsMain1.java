package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true

        String str3 = "hello"; // x003
        String str4 = "hello"; // x003 (문자열 풀에서 똑같은 객체를 반환해 준 것)
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true

        // 문자열 풀(String Pool)
        // 문자열 풀에 hello를 만들어놓고, 이미 hello를 만들었기 때문에 (str3 == str4) 이렇게 됨
    }
}
