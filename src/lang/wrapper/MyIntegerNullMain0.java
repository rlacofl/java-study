package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
//        int[] intArr = {-1, 0, 1, 2, 3};
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1
        System.out.println(findValue(intArr, 100)); // -1
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null; // 없으면 null 반환 가능
    }
}
