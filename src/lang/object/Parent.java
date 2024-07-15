package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받음
// 아무 상속도 받지 않으면 옆에 extends Object가 생략되어 있는 것 (자동으로, 모든 클래스의 최상위 클래스는 Object 클래스)
public class Parent {


    public void parentMethod() {
        System.out.println("Parent.parentMethod"); // 단축키 : soutm
    }
}
