package module01.solutions;

import java.util.Scanner;

// [M01 해설] 미션 3까지 완성한 예시입니다.
// 핵심은 정수 나눗셈 함정: sum / 3 은 정수가 되므로, 3.0으로 나누거나 (double)로 변환해야 합니다.
public class M01_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 1 입력: ");
        int score1 = scanner.nextInt();

        System.out.print("점수 2 입력: ");
        int score2 = scanner.nextInt();

        System.out.print("점수 3 입력: ");
        int score3 = scanner.nextInt();

        int sum = score1 + score2 + score3;
        double average = sum / 3.0;   // sum / 3 으로 쓰면 소수점이 사라진다

        System.out.println("평균: " + average + "점");
    }
}
