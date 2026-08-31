package module06.ex;

// [예제 2] 배열과 반복문
// 인덱스로 도는 for와, 값만 꺼내는 향상된 for를 비교해보세요.
public class Ex02_ForEach {
    public static void main(String[] args) {
        int[] orderAmounts = {12000, 45000, 8000, 30000};

        // 인덱스로 돌기: 몇 번째인지가 필요할 때
        for (int i = 0; i < orderAmounts.length; i++) {
            System.out.println((i + 1) + "번째 주문: " + orderAmounts[i] + "원");
        }

        // 향상된 for: 값만 필요할 때
        int total = 0;
        for (int amount : orderAmounts) {
            total += amount;
        }
        System.out.println("주문 합계: " + total + "원");
    }
}
