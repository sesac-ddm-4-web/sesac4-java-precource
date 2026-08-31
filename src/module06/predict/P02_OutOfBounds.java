package module06.predict;

/*
 * [예측 P02] 경계를 하나 넘으면
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 질문: 몇 개의 숫자가 출력되고, 그다음 무슨 일이 일어날까요?
 *
 * 내 예측:
 *
 * 실행 후 메모:
 *
 * 미션: 에러(스택트레이스)에서 예외 이름과 줄 번호를 읽은 뒤,
 *       조건을 고쳐서 1, 2, 3만 깔끔하게 출력되게 만드세요.
 */
public class P02_OutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
