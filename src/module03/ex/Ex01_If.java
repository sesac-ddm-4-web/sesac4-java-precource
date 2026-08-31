package module03.ex;

// [예제 1] if - else if - else
// 위에서부터 검사해서, '처음' 참이 되는 블록 하나만 실행됩니다.
// 실행해본 뒤 amount 값을 70000, 30000으로 바꿔 다시 실행해보세요.
public class Ex01_If {
    public static void main(String[] args) {
        int amount = 120000; // 주문 금액

        if (amount >= 100000) {
            System.out.println("무료 배송");
        } else if (amount >= 50000) {
            System.out.println("배송비 50% 할인");
        } else {
            System.out.println("배송비 3,000원");
        }
    }
}
