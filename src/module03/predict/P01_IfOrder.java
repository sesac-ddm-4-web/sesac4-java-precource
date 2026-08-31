package module03.predict;

/*
 * [예측 P01] if 조건의 '순서'
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측:
 *   score가 92일 때 출력 →
 *   score를 75로 바꾸면 →  (직접 값을 바꿔 다시 실행해보세요)
 *
 * 실행 후 메모 (예측과 달랐다면, 어디서 생각이 어긋났나?):
 *
 */
public class P01_IfOrder {
    public static void main(String[] args) {
        int score = 92;

        if (score >= 60) {
            System.out.println("합격");
        } else if (score >= 90) {
            System.out.println("장학생");
        } else {
            System.out.println("불합격");
        }

        // 다 확인했다면: "장학생"이 출력되게 하려면 코드를 어떻게 고쳐야 할까요?
    }
}
