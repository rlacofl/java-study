package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
//        Random random = new Random(); // java.util

        // seed 가 같으면 Random의 결과가 같음 (실행 결과 항상 동일)
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble();// 0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);// 0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10까지 출력
        System.out.println("1 ~ 10: " + randomRange2);

        // 1부터 특정 숫자의 int 범위를 구하는 경우, nextInt(int bound)의 결과에 +1을 하면 됨

        // Seed(씨드) - 씨드 값이 같으면 항상 같은 값이 나옴
        // 그럼 왜필요함 ? -> 결과가 고정되기 때문에 테스트 코드 같은 곳에서 같은 결과를 검증할 수 있음
    }
}
