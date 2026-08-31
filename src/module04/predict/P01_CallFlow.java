package module04.predict;

/*
 * [예측 P01] 호출 순서 따라가기
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: 메서드를 호출하면 그 안으로 들어갔다가, 끝나면 호출한 줄의 '다음'으로 돌아옵니다.
 *
 * 내 예측 (출력 순서대로):
 *
 * 실행 후 메모:
 *
 */
public class P01_CallFlow {
    public static void main(String[] args) {
        System.out.println("1. 주문 접수");
        processPayment();
        System.out.println("5. 주문 완료");
    }

    static void processPayment() {
        System.out.println("2. 결제 시작");
        checkCard();
        System.out.println("4. 결제 승인");
    }

    static void checkCard() {
        System.out.println("3. 카드 확인");
    }
}
