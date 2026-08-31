package module04.ex;

// [예제 3] 오버로딩: 같은 이름, 다른 매개변수
// 인자의 타입과 개수를 보고 맞는 메서드가 선택됩니다.
public class Ex03_Overload {
    public static void main(String[] args) {
        System.out.println(area(5));          // 정사각형
        System.out.println(area(4, 6));       // 직사각형
        System.out.println(area(3.0));        // 원
    }

    static int area(int side) {
        return side * side;
    }

    static int area(int width, int height) {
        return width * height;
    }

    static double area(double radius) {
        return 3.14 * radius * radius;
    }
}
