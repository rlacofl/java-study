package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("1");
        UserV1 user2 = new UserV1("1");

        System.out.println("identity = " + (user1 == user2));  // false
        System.out.println("equals = " + user1.equals(user2)); // false
        // 왜 false로 나오나면, equals 메서드가 비교하는 방식은 == 방식을 사용하기 때문에
        // 따지고 보면 == 방식(동등성 비교)과 같은 결과가 나옴

        // 그래서 동등성 비교를 하고싶으면 equals 메서드를 오버라이딩(재정의) 해야함




    }
}
