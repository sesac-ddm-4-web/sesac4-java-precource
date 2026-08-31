package module02.predict;

/*
 * [예측 P02] 단락 평가 (short-circuit)
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: &&는 앞이 false면 뒤를 아예 계산하지 않습니다. ||는 앞이 true면 마찬가지입니다.
 *       count가 언제 증가하고 언제 증가하지 않는지가 관전 포인트입니다.
 *
 * 내 예측 (3줄):
 *
 * 실행 후 메모:
 *
 */
public class P02_ShortCircuit {
    public static void main(String[] args) {
        int count = 0;

        boolean r1 = false && (++count > 0);
        System.out.println(r1 + ", count = " + count);

        boolean r2 = true || (++count > 0);
        System.out.println(r2 + ", count = " + count);

        boolean r3 = true && (++count > 0);
        System.out.println(r3 + ", count = " + count);
    }
}
