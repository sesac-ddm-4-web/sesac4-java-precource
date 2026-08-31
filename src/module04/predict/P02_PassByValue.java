package module04.predict;

/*
 * [예측 P02] 값 전달: 복사본이 넘어간다
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 질문: "메서드 안"과 "메서드 밖"에는 각각 어떤 숫자가 찍힐까요?
 *
 * 내 예측 (3줄):
 *
 * 실행 후 메모:
 *
 */
public class P02_PassByValue {
    public static void main(String[] args) {
        int money = 100;
        addTen(money);
        System.out.println("메서드 밖: " + money);

        money = addTenAndReturn(money);
        System.out.println("리턴으로 받으면: " + money);
    }

    static void addTen(int n) {
        n = n + 10;
        System.out.println("메서드 안: " + n);
    }

    static int addTenAndReturn(int n) {
        return n + 10;
    }
}
