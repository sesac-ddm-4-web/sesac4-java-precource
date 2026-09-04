package module04.make;

/*
 * [작성 W01] 등급 계산 메서드
 *
 * 점수를 받아 등급 문자열을 돌려주는 메서드를 완성하세요.
 *   - 90점 이상: "A"
 *   - 80점 이상: "B"
 *   - 70점 이상: "C"
 *   - 그 외: "F"
 *
 * 힌트:
 *   - 모듈 3의 if / else if 순서 감각과, 이 모듈의 return을 조합하면 됩니다.
 *   - return을 만나면 메서드가 즉시 끝난다는 점을 이용하면 else 없이도 쓸 수 있습니다.
 *
 * 아래 검증 코드가 전부 PASS면 성공입니다. (검증 코드는 수정하지 마세요)
 * 검증 코드에는 아직 배우지 않은 문법이 섞여 있을 수 있습니다. 읽지 못해도 괜찮고, 수정만 하지 않으면 됩니다.
 * 90점(경계값)이 어느 등급인지 주의하세요.
 */
public class W01_Grade {

    static String grade(int score) {
        // ===== 여기부터 작성 =====

        return "";

        // ===== 여기까지 작성 =====
    }

    // ----- 검증 (수정 금지) -----
    public static void main(String[] args) {
        check(95, "A");
        check(90, "A");
        check(89, "B");
        check(70, "C");
        check(69, "F");
    }

    static void check(int score, String expected) {
        String actual = grade(score);
        if (actual.equals(expected)) {
            System.out.println(score + "점 → " + actual + " : PASS");
        } else {
            System.out.println(score + "점 → " + actual + " : FAIL (기대값 " + expected + ")");
        }
    }
}
