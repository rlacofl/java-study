package enumeration.ref1;

public class DiscountService {

    // ClassGrade 라는 타입을 받게 됨
    public int discount(ClassGrade classGrade, int price) {
//        int discountPercent = classGrade.getDiscountPercent();
//        return price * discountPercent / 100;

        // ctrl + alt + N (inline variable)
        return price * classGrade.getDiscountPercent() / 100;
    }
}
