package module03.predict;

/*
 * [예측 P03] break와 continue
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 질문: 어떤 숫자들이, 어떤 순서로 찍힐까요? 마지막 줄의 i는 얼마일까요?
 *
 * 내 예측:
 *
 * 실행 후 메모:
 *
 */
public class P03_LoopExit {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;
            if (i % 2 == 0) {
                continue; // 짝수면 아래를 건너뛰고 다음 회차로
            }
            System.out.println(i);
            if (i >= 5) {
                break; // 반복 자체를 종료
            }
        }
        System.out.println("끝: i = " + i);
    }
}
