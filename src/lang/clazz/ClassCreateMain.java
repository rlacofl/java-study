package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // getDeclaredConstructor(): 생성자를 선택
        // newInstance(): hello 클래스가 가진 생성자를 얻어서 객체 생성 (선택된 생성자를 기반으로)

        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);

    }
}
/*
리플렉션 (reflection): Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된
메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는
작업을 할 수 있음. 이러한 작업을 리플렉션이라고 함. 추가로 애노테이션 정보를 읽어서 특별한
기능 수행도 가능함.
 */