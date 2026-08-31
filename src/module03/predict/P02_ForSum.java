package module03.predict;

/*
 * [예측 P02] for의 흐름 따라가기
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: i가 매 회차에 어떻게 변하는지 표를 그리듯 따라가 보세요. (i → sum → count)
 *
 * 내 예측:
 *   출력 1 →
 *   출력 2 →
 *
 * 실행 후 메모:
 *
 */
public class P02_ForSum {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i += 3) {
            sum += i;
            count++;
        }
        System.out.println("출력 1: " + count + "번 더해서 " + sum);

        int n = 0;
        for (int i = 0; i < 5; i++) {
            n = i;
        }
        System.out.println("출력 2: " + n); // 반복이 끝난 뒤 n에는 무엇이 남을까?
    }
}
