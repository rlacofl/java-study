package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        // Class 조회
        // 타입.class 하고 하면 만든 클래스의 정보를 다 얻을 수 있음 (클래스 라는 클래스 ..?)

        Class clazz = String.class; // 1. 클래스에서 조회
        // Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
        // Class clazz = Class.forName("java.lang.String");// 3. 문자열로 조회

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }
        
        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) { // iter
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력 (상속은 하나만 가능하기 때문에 !)
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        // 상속 받은 클래스가 없으면 ~? 자동으로 Object 클래스가 온다

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }

    }
}
