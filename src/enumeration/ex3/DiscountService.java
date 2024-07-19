package enumeration.ex3;

public class DiscountService {

    // 상수이기 때문에 static import를 쓸 수 있는데 Grade에서 add-on 활성화가 안 되네 ..
    // 열거형도 사전의 정의된 상수들로 구성되어있기 때문에
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // 여기서 Grade. 빼도 됨
        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        // 10000 * (20 / 100) -> 2000
        return price * discountPercent / 100;
    }
}
