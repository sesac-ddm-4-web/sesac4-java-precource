package module01.modify;

import java.util.Scanner;

/*
 * [변형 M01] 평균 계산기 업그레이드
 *
 * 아래는 점수 2개를 입력받아 합계를 출력하는 완성된 프로그램입니다.
 * 그대로 한 번 실행해보고 시작하세요.
 *
 * 미션 (하나 끝낼 때마다 실행해서 확인):
 *   1) 합계 대신 평균을 출력하기.
 *      주의: 85와 90의 평균은 87이 아니라 87.5가 나와야 합니다. (정수 나눗셈 함정)
 *   2) 점수를 3개 입력받도록 확장하기
 *   3) 출력을 "평균: 87.5점" 형태로 다듬기
 *
 * 다 되면: solutions/M01_Solution.java 와 비교해보세요.
 */
public class M01_AverageInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 1 입력: ");
        int score1 = scanner.nextInt();

        System.out.print("점수 2 입력: ");
        int score2 = scanner.nextInt();

        int sum = score1 + score2;
        System.out.println("합계: " + sum);
    }
}
