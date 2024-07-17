package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)을 가져옴
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)을 가져옴
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽음
        System.out.println("getenv = " + System.getenv()); // 시스템 환경 변수 세팅값

        // 시스템 속성을 읽음
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사하기 (System.arraycopy())
        char[] originalArray =  {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 원래라면 위에 코드를 for문으로 돌려서 하나하나 출력되게 해야하지만, System.arraycopy()를 사용하면 한번에 복사 가능
        // 운영체제나 시스템 레벨, 하드웨어에서 이 배열을 그냥 통째로 복사해버림
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray); // [ = 배열 / C = char
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 권장 X. 가급적이면 사용하지말기 (그냥 쓰지말자 - 의도치 않게 종료될 수도 있기 때문에)
        System.out.println("hello"); // 애초에 활성화가 안 되네 ㄷㄷ
        // System.exit(0)을 만나면 프로그램이 종료되기 때문에 위에 코드는 실행되지 않음


    }
}
