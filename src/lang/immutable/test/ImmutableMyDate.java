package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*
    불변 객체에서 값을 변경하는 경우:
    기존 값을 유지한 상태로, 어떤 값을 넣어서 새로 반환할 때는 앞에 with 라는 표현을 많이 사용함
    불변 객체의 메서드가 with로 이름 지어진 경우, 그 메서드가 지정된 수정사항을 포함하는 객체 새 인스턴스를
    반환한다는 사실을 뜻함 (관례처럼 사용됨 - 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을
    새 복사본에 포함하는 과정을 간결하게 표현)
    set은 원본 객체의 상태를 변경하고, with는 새로운 객체를 반환함
     */

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
