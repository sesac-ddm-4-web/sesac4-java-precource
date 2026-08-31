package module05.predict;

/*
 * [예측 P01] 객체는 각자의 필드를 가진다
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (2줄):
 *
 * 실행 후 메모:
 *
 */
public class P01_TwoObjects {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.money = 1000;

        Wallet w2 = new Wallet();
        w2.money = 5000;

        w1.money += 500;

        System.out.println("w1: " + w1.money);
        System.out.println("w2: " + w2.money);
    }
}

class Wallet {
    int money;
}
