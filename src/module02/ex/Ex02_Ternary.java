package module02.ex;

// [예제 2] 삼항 연산자: 조건 ? 참일 때 값 : 거짓일 때 값
public class Ex02_Ternary {
    public static void main(String[] args) {
        int orderAmount = 45000;

        int shippingFee = orderAmount >= 50000 ? 0 : 3000;
        String message = shippingFee == 0 ? "무료배송" : "배송비 " + shippingFee + "원";

        System.out.println(message);

        // orderAmount를 60000으로 바꿔서 다시 실행해보세요.
    }
}
