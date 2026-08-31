package module01.ex;

// [예제 1] 변수 선언과 기본 타입
// 실행해본 뒤, 값을 바꾸거나 변수를 하나 더 만들어보세요.
public class Ex01_Variables {
    public static void main(String[] args) {
        int stock = 25;                  // 재고 수량
        long totalSales = 3500000000L;   // 누적 판매액. int 범위(약 21억)를 넘어서 long
        double discountRate = 0.15;      // 할인율
        boolean isOpen = true;           // 영업 중인가
        char grade = 'A';                // 등급 문자 하나
        String productName = "무선 키보드";

        System.out.println("상품명: " + productName);
        System.out.println("재고: " + stock);
        System.out.println("누적 판매액: " + totalSales);
        System.out.println("할인율: " + discountRate);
        System.out.println("영업 중: " + isOpen);
        System.out.println("등급: " + grade);

        stock = stock - 1; // 하나 팔렸다. 변수의 값은 바꿀 수 있다
        System.out.println("판매 후 재고: " + stock);
    }
}
