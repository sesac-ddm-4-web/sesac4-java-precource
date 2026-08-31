package module02.predict;

/*
 * [예측 P01] 전위와 후위
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (4줄):
 *
 * 실행 후 메모:
 *
 */
public class P01_IncDec {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        int a = 3;
        int b = a++ + 2;
        System.out.println(a + ", " + b);

        // 실행 후 생각해보기: 마지막 같은 코드는 맞히기도 어렵고 읽기도 어렵습니다.
        // 증감 연산자는 다른 식에 섞지 말고 한 줄에 단독으로 쓰는 습관을 들이세요.
    }
}
