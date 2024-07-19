package enumeration.ref3;

public enum Grade {
    // 상수 마지막에 괄호를 열고 생성자에 맞는 인수를 전달하면 적절한 생성자가 호출됨.
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discountPercent;

    // private (안 적어도 됨)
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 값 조회.
    public int getDiscountPercent() {
        return discountPercent;
    }

    // 메서드 추가 (할인율 안에서 계산하기)
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
