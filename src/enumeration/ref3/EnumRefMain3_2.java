package enumeration.ref3;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

//        int basic = Grade.BASIC.discount(price);
//        int gold = Grade.GOLD.discount(price);
//        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("BASIC 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 할인 금액: " + Grade.DIAMOND.discount(price));

        // 이렇게 되면 이제 DiscountService 클래스는 필요가 없음 !
    }
}
