package module04.modify;

/*
 * [변형 M01] 복붙 코드를 메서드로 추출하기
 *
 * 아래는 세 상품의 할인가를 계산하는, '동작은 하지만 부끄러운' 프로그램입니다.
 * 같은 계산이 세 번 복사되어 있습니다. 그대로 한 번 실행해보고 시작하세요.
 *
 * 미션:
 *   1) 중복된 계산을 메서드 하나로 추출하세요.
 *      예: static int discountedPrice(int price, int rate)
 *   2) main에서는 그 메서드를 세 번 호출만 하도록 바꾸세요.
 *   3) 다 바꾼 뒤 실행해서, 바꾸기 전과 출력이 완전히 같은지 확인하세요.
 *      (동작을 바꾸지 않고 구조만 바꾸는 것을 '리팩터링'이라고 합니다)
 *
 * 여유가 있다면:
 *   4) 출력 부분도 메서드로 추출해보세요.
 *      예: static void printPrice(String name, int price, int rate)
 *
 * 다 되면: solutions/M01_Solution.java 와 비교해보세요.
 */
public class M01_Extract {
    public static void main(String[] args) {
        int keyboardPrice = 49000;
        int keyboardRate = 10;
        int keyboardDiscounted = keyboardPrice - keyboardPrice * keyboardRate / 100;
        System.out.println("무선 키보드: " + keyboardDiscounted + "원 (" + keyboardRate + "% 할인)");

        int mousePrice = 23000;
        int mouseRate = 15;
        int mouseDiscounted = mousePrice - mousePrice * mouseRate / 100;
        System.out.println("무선 마우스: " + mouseDiscounted + "원 (" + mouseRate + "% 할인)");

        int monitorPrice = 310000;
        int monitorRate = 5;
        int monitorDiscounted = monitorPrice - monitorPrice * monitorRate / 100;
        System.out.println("모니터: " + monitorDiscounted + "원 (" + monitorRate + "% 할인)");
    }
}
