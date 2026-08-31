package module05.solutions;

// [W01 해설] 필드, 생성자, 메서드가 한 클래스 안에서 어떻게 협력하는지 보세요.
// 이 모양(데이터 + 생성자 + 데이터를 쓰는 메서드)이 앞으로 만들 거의 모든 클래스의 골격입니다.
public class W01_Solution {
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("김영희", 25);

        System.out.println(m1.introduce());
        System.out.println(m2.introduce());
    }
}

class Member {
    String name;
    int age;

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String introduce() {
        return name + "(" + age + ")";
    }
}
