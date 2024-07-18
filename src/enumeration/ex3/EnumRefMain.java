package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    // enum은 자동으로 toString을 override 하기 때문에 참조값을 볼 수 있는 메서드 만듦
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
