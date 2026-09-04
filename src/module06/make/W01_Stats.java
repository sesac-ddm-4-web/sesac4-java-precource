package module06.make;

/*
 * [작성 W01] 최고 점수와 평균 구하기
 *
 * scores 배열을 반복문으로 돌면서 다음 두 값을 구하세요.
 *   1) max: 가장 높은 점수
 *   2) average: 평균 (double. 정수 나눗셈 함정 주의)
 *
 * 힌트:
 *   - max는 "일단 첫 값을 최고라고 두고, 돌면서 더 큰 값을 만나면 교체"가 기본 전략입니다.
 *   - 평균은 합계를 먼저 구한 뒤 개수로 나눕니다. 개수는 scores.length에 있습니다.
 *
 * 아래 검증 코드가 PASS를 출력하면 성공입니다. (검증 코드는 수정하지 마세요)
 * 검증 코드에는 아직 배우지 않은 문법이 섞여 있을 수 있습니다. 읽지 못해도 괜찮고, 수정만 하지 않으면 됩니다.
 */
public class W01_Stats {
    public static void main(String[] args) {
        int[] scores = {70, 95, 60, 88, 78};

        int max = 0;
        double average = 0;

        // ===== 여기부터 작성 =====



        // ===== 여기까지 작성 =====

        // ----- 검증 (수정 금지) -----
        boolean maxOk = max == 95;
        boolean avgOk = average == 78.2;
        System.out.println("최고 점수(" + max + ") : " + (maxOk ? "PASS" : "FAIL (기대값 95)"));
        System.out.println("평균(" + average + ") : " + (avgOk ? "PASS" : "FAIL (기대값 78.2)"));
    }
}
