package module07.solutions;

import java.util.Scanner;

/*
 * [해설] 숫자 야구 완성 예시. 정답은 하나가 아닙니다.
 *
 * 구조 읽는 법:
 *   main            : 게임 진행(반복, 입력, 종료)만 담당
 *   generateAnswer  : 서로 다른 숫자 3개 만들기
 *   toDigits        : 입력받은 수를 자릿수 배열로 쪼개기
 *   judge           : 정답과 추측을 비교해 [스트라이크, 볼] 리턴
 *   formatResult    : 판정 결과를 출력 문장으로 변환
 * 역할을 메서드로 나누면, 읽을 때도 "이름만 보고" 흐름을 따라갈 수 있습니다.
 */
public class BaseballGameSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] answer = generateAnswer();
        int attempts = 0;

        System.out.println("숫자 야구를 시작합니다. 서로 다른 숫자 3자리를 맞혀보세요.");

        while (true) {
            System.out.print("입력: ");
            int guessNumber = scanner.nextInt();

            if (guessNumber < 100 || guessNumber > 999) {
                System.out.println("100부터 999 사이의 수를 입력하세요.");
                continue;
            }

            attempts++;
            int[] guess = toDigits(guessNumber);
            int[] result = judge(answer, guess);
            int strikes = result[0];
            int balls = result[1];

            if (strikes == 3) {
                System.out.println("3스트라이크! 정답입니다.");
                System.out.println("시도 횟수: " + attempts + "회");
                break;
            }

            System.out.println(formatResult(strikes, balls));
        }
    }

    // 서로 다른 숫자 3개 만들기. 겹치면 될 때까지 다시 뽑는다.
    static int[] generateAnswer() {
        while (true) {
            int a = (int) (Math.random() * 9) + 1;   // 첫 자리는 1~9
            int b = (int) (Math.random() * 10);
            int c = (int) (Math.random() * 10);

            if (a != b && b != c && a != c) {
                return new int[]{a, b, c};
            }
        }
    }

    // 3자리 수를 자릿수 배열로 쪼갠다. 예: 425 → {4, 2, 5}
    static int[] toDigits(int number) {
        return new int[]{number / 100, number / 10 % 10, number % 10};
    }

    // 판정 결과를 사람이 읽을 문장으로 바꾼다. 예: "1스트라이크 1볼", "2볼", "낫싱"
    static String formatResult(int strikes, int balls) {
        if (strikes == 0 && balls == 0) {
            return "낫싱";
        }
        String result = "";
        if (strikes > 0) {
            result += strikes + "스트라이크";
        }
        if (balls > 0) {
            if (strikes > 0) {
                result += " ";
            }
            result += balls + "볼";
        }
        return result;
    }

    // 정답과 추측을 비교해 {스트라이크, 볼}을 리턴한다.
    static int[] judge(int[] answer, int[] guess) {
        int strikes = 0;
        int balls = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (answer[i] == guess[j]) {
                    if (i == j) {
                        strikes++;
                    } else {
                        balls++;
                    }
                }
            }
        }
        return new int[]{strikes, balls};
    }
}
