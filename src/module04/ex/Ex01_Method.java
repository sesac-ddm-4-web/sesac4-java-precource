package module04.ex;

// [예제 1] 메서드 선언과 호출
// main에서 시작해서, 호출한 메서드에 들어갔다가, 끝나면 되돌아옵니다.
public class Ex01_Method {
    public static void main(String[] args) {
        int total = add(3, 5);
        System.out.println("3 + 5 = " + total);

        printReceipt("아메리카노", 4500);
        printReceipt("크루아상", 3800);
    }

    // int 두 개를 받아 int를 돌려주는 메서드
    static int add(int a, int b) {
        return a + b;
    }

    // 돌려줄 값이 없는 메서드 (void)
    static void printReceipt(String name, int price) {
        System.out.println("[영수증] " + name + " : " + price + "원");
    }
}
