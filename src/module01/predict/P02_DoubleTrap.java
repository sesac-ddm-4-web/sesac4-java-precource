package module01.predict;

/*
 * [예측 P02] 실수(double)의 함정
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (3줄):
 *
 * 실행 후 메모:
 *
 */
public class P02_DoubleTrap {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(0.1 + 0.2 == 0.3);
        System.out.println(10.0 / 3);

        // 실행 후 읽어보기:
        // double은 값을 2진수로 어림해서 저장하는 '근사값'입니다.
        // 그래서 돈처럼 1원도 틀리면 안 되는 계산에 double을 쓰면 사고가 납니다.
        // 실무에서는 금액을 정수(원 단위의 long)나 전용 클래스(BigDecimal)로 다룹니다.
        // 지금 기억할 것 하나: "돈 계산에 double 금지".
    }
}
