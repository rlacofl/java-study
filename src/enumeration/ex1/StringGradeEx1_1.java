package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 할인 금액: " + basic); // 1000
        System.out.println("GOLD 할인 금액: " + gold); // 2000
        System.out.println("DIAMOND 할인 금액: " + diamond); // 3000






    }
}
