package module04.predict;

/*
 * [예측 P03] 오버로딩: 어떤 메서드가 선택될까
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: 마지막 줄이 함정입니다. char를 받는 show는 없습니다. 그러면 어디로 갈까요?
 *       (모듈 1에서 char를 int에 넣으면 어떻게 됐는지 떠올려보세요)
 *
 * 내 예측 (4줄):
 *
 * 실행 후 메모:
 *
 */
public class P03_Overload {
    public static void main(String[] args) {
        show(5);
        show(5.0);
        show("5");
        show('A');
    }

    static void show(int x) {
        System.out.println("정수 버전: " + x);
    }

    static void show(double x) {
        System.out.println("실수 버전: " + x);
    }

    static void show(String x) {
        System.out.println("문자열 버전: " + x);
    }
}
