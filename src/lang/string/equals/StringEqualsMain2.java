package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("메서드 호출 비교 1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2: " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
        /*
        문자열 비교를 new로 한 게 들어올지, 문자열 풀에 있는게 들어올지, 어떻게 될지 모르기 때문에
        문자열에 대한 비교는 항상 equals로 해줘야함
        *문자열 비교는 절대 == 비교로 하면 안됨
         */
    }
}
