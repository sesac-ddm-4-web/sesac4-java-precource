package module02.trace;

/*
 * [버그 찾기 T01] 할인이 적용되지 않는다
 *
 * 목표: 10000원짜리 상품에 15% 할인을 적용해 8500원을 출력하는 프로그램입니다.
 *       그런데 실행하면 10000이 나옵니다. 할인이 사라졌습니다.
 *
 * 미션:
 *   1) 실행하지 말고 코드만 읽으면서 원인을 찾아보세요.
 *      (힌트: rate / 100 부분만 따로 계산해보세요. 모듈 1에서 배운 함정입니다)
 *   2) 코드를 고쳐서 8500이 출력되게 만드세요.
 *
 * 내가 찾은 원인:
 *
 */
public class T01_DiscountBug {
    public static void main(String[] args) {
        int price = 10000;
        int rate = 15;   // 할인율 15%

        int discounted = price - price * (rate / 100);

        System.out.println(discounted);   // 8500이 나와야 합니다

        // 고치는 방법은 하나가 아닙니다.
        // 곱셈을 먼저 하도록 순서를 바꿀 수도 있고, 실수로 계산할 수도 있습니다.
        // 두 방법 모두 시도해보세요.
    }
}
