package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA); // 서울
        System.out.println("memberB = " + memberB); // 서울

        // 회원B의 주소를 부산으로 변경해야함
//        Address address1 = memberB.getAddress();
//        address1.setValue("부산");

        memberB.getAddress().setValue("부산"); // 위에 두 줄이랑 똑같은 의미 (축약)

        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);  // 서울
        System.out.println("memberB = " + memberB);  // 부산
    }
}
