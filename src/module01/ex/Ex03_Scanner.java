package module01.ex;

import java.util.Scanner;

// [예제 3] Scanner로 키보드 입력 받기
// 실행하면 프로그램이 입력을 기다립니다. 실행 창을 클릭해 값을 입력하고 Enter를 누르세요.
public class Ex03_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("상품 가격 입력: ");
        int price = scanner.nextInt();

        System.out.print("수량 입력: ");
        int quantity = scanner.nextInt();

        System.out.println("총액: " + (price * quantity) + "원");
    }
}
