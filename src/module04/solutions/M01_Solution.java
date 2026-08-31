package module04.solutions;

// [M01 해설] 미션 4까지 완성한 예시입니다.
// 비교 포인트: 계산이 한 곳에만 있으므로, 할인 공식이 바뀌어도 한 곳만 고치면 됩니다.
// 중복 제거의 진짜 이유는 '짧아서'가 아니라 '고칠 곳이 하나라서'입니다.
public class M01_Solution {
    public static void main(String[] args) {
        printPrice("무선 키보드", 49000, 10);
        printPrice("무선 마우스", 23000, 15);
        printPrice("모니터", 310000, 5);
    }

    static int discountedPrice(int price, int rate) {
        return price - price * rate / 100;
    }

    static void printPrice(String name, int price, int rate) {
        System.out.println(name + ": " + discountedPrice(price, rate) + "원 (" + rate + "% 할인)");
    }
}
