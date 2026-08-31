package module04.ex;

// [예제 2] return과 가드 패턴
// 안 되는 경우를 먼저 걸러내고 일찍 return하면, 정상 케이스가 중첩 없이 깔끔해집니다.
public class Ex02_Guard {
    public static void main(String[] args) {
        System.out.println(withdraw(50000, -100));
        System.out.println(withdraw(50000, 80000));
        System.out.println(withdraw(50000, 30000));
    }

    static String withdraw(int balance, int amount) {
        if (amount <= 0) {
            return "잘못된 금액입니다";
        }
        if (amount > balance) {
            return "잔액이 부족합니다";
        }
        return "출금 완료: " + amount + "원 (잔액 " + (balance - amount) + "원)";
    }
}
