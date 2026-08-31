package module05.ex;

// [예제 2] 생성자와 this
// 생성자는 new 할 때 실행되어 초기값을 강제합니다. 이름이 클래스와 같고 리턴 타입이 없습니다.
public class Ex02_Constructor {
    public static void main(String[] args) {
        Product p1 = new Product("무선 키보드", 49000);
        Product p2 = new Product("모니터", 310000);

        p1.printInfo();
        p2.printInfo();

        // new Product(); 는 이제 컴파일 에러입니다.
        // 생성자를 직접 만들면, 매개변수 없는 기본 생성자는 사라지기 때문입니다.
        // 주석을 풀어 직접 에러 메시지를 확인해보세요.
        // Product p3 = new Product();
    }
}

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;     // this.name은 필드, name은 매개변수
        this.price = price;
    }

    void printInfo() {
        System.out.println(name + " : " + price + "원");
    }
}
