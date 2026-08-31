package module01.predict;

/*
 * [예측 P03] 형변환과 문자열 변환
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (5줄):
 *
 * 실행 후 메모:
 *
 */
public class P03_Casting {
    public static void main(String[] args) {
        double d = 3.99;
        System.out.println((int) d);

        char ch = 'A';
        int code = ch;
        System.out.println(code);

        double e = 5;
        System.out.println(e);

        System.out.println(Integer.parseInt("123") + 1);
        System.out.println("123" + 1);
    }
}
