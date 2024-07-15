// 생략 가능
import java.lang.System;
import java.util.Scanner;

public class LangMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 성의 세로 크기와 가로 크기를 각각 N, M으로 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        // nextInt() 메서드 이후에 남아 있는 개행 문자를 제거
        sc.nextLine();

        // 이차원 배열 생성 (성의 상태 저장)
        char[][] castle = new char[N][M];

        // 각 행의 성 상태를 입력받아 이차원 배열 castle에 저장
        for (int i = 0; i < N; i++) {
            // 한 줄 씩 입력받기 (...X.) 뭐 이런식으로
            String c = sc.nextLine();
            // 입력받은 문자열을 문자 배열로 반환 [., ., ., X, .]
            char[] d = c.toCharArray();

            // 내부 for 루프로 각 문자를 castle 배열에 저장함
            for (int j = 0; j < M; j++) {
                castle[i][j] = d[j];
            }
        }


        int noN = 0; // 경비원 없는 행의 수
        int temp = 0; // 경비원이 있는지 확인하는 임시 변수

        // 행행행행행
        // 각 행에 경비원이 있는지 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // 현재 위치에 경비원이 있다면 temp를 증가
                if (castle[i][j] == 'X') {
                    temp++;
                }
            }
            // 내부 for 루프가 끝나고 temp가 0인 경우(경비원이 없는 경우) noN을 증가
                if (temp == 0) {
                    noN++;
                }

            // temp를 0으로 초기화하여 다음 행을 검사할 준비
            temp = 0;
        }

        int noM = 0; // 경비원 없는 열의 수

        // 열열열열열
        // 각 열에 경비원이 있는지 확인
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                // 현재 위치에 경비원이 있다면 temp를 증가
                if (castle[i][j] == 'X') {
                    temp++;
                }
            // 내부 for 루프가 끝나고 temp가 0인 경우(경비원이 없는 경우) noM을 증가
            } if (temp == 0) {
                noM++;

            // temp를 0으로 초기화하여 다음 행을 검사할 준비
            } temp = 0;
        }

        // 경비원이 없는 행과 열 중 더 큰 값을 출력. 이는 추가해야 할 최소 경비원의 수를 의미
        if (noN >= noM) {
            System.out.println(noN);
        } else {
            System.out.println(noM);
        }
        sc.close();
    }
}
