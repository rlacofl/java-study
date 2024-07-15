package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA); // 서울
        System.out.println("memberB = " + memberB); // 서울

//        memberB.getAddress().setValue("부산");  // 불변이라서 안 됨 ! (컴파일 오류)

        memberB.setAddress(new ImmutableAddress("부산"));  // 이렇게 새 객체를 만들어야함
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);  // 서울
        System.out.println("memberB = " + memberB);  // 부산
    }
}
