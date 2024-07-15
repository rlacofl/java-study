package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음.

        // 서로 다른 참조
        Address a = new Address("서울");
        Address b = new Address("서울");

        // 서로 다른 객체를 참조해서, 같은 객체를 공유하지 않으면 문제가 해결됨.

        System.out.println("a = " + a);  // 서울
        System.out.println("b = " + b);  // 서울

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);  // 서울
        System.out.println("b = " + b);  // 부산

    }
}
