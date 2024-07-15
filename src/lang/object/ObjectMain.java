package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드 (객체에 대한 어떤 정보를 제공(반환)해주는 역할)
        String string = child.toString();
        System.out.println(string);




    }
}

