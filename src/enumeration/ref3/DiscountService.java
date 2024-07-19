package enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        // Grade에 계산 로직이 있기 때문에
        return grade.discount(price);
    }
}
