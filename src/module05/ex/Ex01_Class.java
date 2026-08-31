package module05.ex;

// [예제 1] 클래스 선언과 객체 생성
// Member는 설계도, new Member()로 만든 것이 실물(객체)입니다.
public class Ex01_Class {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.name = "홍길동";
        m1.point = 1200;

        Member m2 = new Member();
        m2.name = "김영희";
        m2.point = 3400;

        m1.printInfo();
        m2.printInfo();

        m1.point += 100;   // m1만 바뀐다
        m1.printInfo();
        m2.printInfo();
    }
}

// 회원을 표현하는 클래스. 데이터(필드)와 동작(메서드)을 묶는다.
class Member {
    String name;
    int point;

    void printInfo() {
        System.out.println(name + " (" + point + "점)");
    }
}
