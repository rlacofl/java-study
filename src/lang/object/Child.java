package lang.object;

// 명시적으로 상속을 받았기 때문에 Object 클래스를 상속받지 않음
public class Child extends Parent {

        public void childMethod() {
            System.out.println("Child.childMethod");
        }
}
