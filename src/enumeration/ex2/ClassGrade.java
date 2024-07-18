package enumeration.ex2;

public class ClassGrade {

    // 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수 선언
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() {
    }
}
