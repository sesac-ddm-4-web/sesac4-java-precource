package module02.predict;

/*
 * [예측 P03] 오버플로, Infinity, NaN
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: int의 최대값은 2147483647입니다. 그 너머에는 무엇이 있을까요?
 *
 * 내 예측 (5줄):
 *
 * 실행 후 메모:
 *
 */
public class P03_Overflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;   // 2147483647
        System.out.println(max + 1);

        System.out.println(100000 * 100000);
        System.out.println(100000L * 100000);

        System.out.println(5.0 / 0);
        System.out.println(0.0 / 0.0);

        // 실행 후 실험해보기: System.out.println(5 / 0); 을 추가하면 어떻게 될까요?
        // (프로그램이 죽으면서 빨간 메시지가 나옵니다. 그것이 '예외'이고, 본과정에서 다룹니다)
    }
}
