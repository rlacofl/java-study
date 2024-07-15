package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");  // change()를 모르는 상태
        System.out.println("a = " + a);  
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {

        System.out.println("changeAddress = " + changeAddress);
        address.setValue(changeAddress);
    }
}
