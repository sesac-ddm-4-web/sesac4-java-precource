package module05.ex;

// [예제 3] 인스턴스 멤버 vs 정적(static) 멤버
// count는 객체마다 하나씩, totalCount는 전체에서 딱 하나입니다.
public class Ex03_Static {
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        a.increase();
        a.increase();
        b.increase();

        System.out.println("a의 count: " + a.count);
        System.out.println("b의 count: " + b.count);
        System.out.println("전체 count: " + Counter.totalCount);   // 클래스 이름으로 접근
    }
}

class Counter {
    int count;                // 인스턴스 필드: 객체마다 따로
    static int totalCount;    // 정적 필드: 클래스에 하나

    void increase() {
        count++;
        totalCount++;
    }
}
