package module05.make;

/*
 * [작성 W01] Member 클래스 완성하기
 *
 * 아래쪽의 Member 클래스를 완성하세요. 조건:
 *   1) 필드: 이름(String name), 나이(int age)
 *   2) 생성자: 이름과 나이를 받아 필드에 저장 (this를 쓰게 됩니다)
 *   3) introduce() 메서드: "이름(나이)" 형태의 문자열을 리턴. 예: "홍길동(20)"
 *
 * 아래 검증 코드가 전부 PASS면 성공입니다. (검증 코드는 수정하지 마세요)
 * 막히면 20분까지만 고민하고 solutions/W01_Solution.java 를 열어보세요.
 */
public class W01_Member {

    // ----- 검증 (수정 금지) -----
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("김영희", 25);

        check(m1.introduce(), "홍길동(20)");
        check(m2.introduce(), "김영희(25)");
    }

    static void check(String actual, String expected) {
        if (expected.equals(actual)) {
            System.out.println(actual + " : PASS");
        } else {
            System.out.println("FAIL - 내 결과: " + actual + " / 기대값: " + expected);
        }
    }
}

class Member {
    // ===== 여기부터 작성 =====
    // 1) 필드 2개를 선언하세요.

    Member(String name, int age) {
        // 2) 전달받은 값을 필드에 저장하세요.
    }

    String introduce() {
        // 3) "이름(나이)" 형태의 문자열을 만들어 리턴하세요.
        return "";
    }
    // ===== 여기까지 작성 =====
}
