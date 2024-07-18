package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {

    // ClassGrade 라는 타입을 받게 됨
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        // == : 참조값 비교
        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        // 10000 * (20 / 100) -> 2000
        return price * discountPercent / 100;
    }
}
