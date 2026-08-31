package module05.predict;

/*
 * [예측 P02] 참조 복사의 함정
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: b2 = b1 에서 복사되는 것은 객체일까요, 주소일까요?
 *
 * 내 예측 (3줄):
 *
 * 실행 후 메모:
 *
 */
public class P02_SameRef {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.itemCount = 1;

        Bag b2 = b1;
        b2.itemCount = 99;

        System.out.println("b1: " + b1.itemCount);
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("새 가방끼리: " + (new Bag() == new Bag()));
    }
}

class Bag {
    int itemCount;
}
