package module04.solutions;

// [W01 해설] return의 '즉시 종료' 성질을 쓰면 else가 필요 없습니다.
// 위에서 걸러지지 않고 내려왔다는 것 자체가 조건이기 때문입니다.
public class W01_Solution {

    static String grade(int score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        return "F";
    }

    public static void main(String[] args) {
        check(95, "A");
        check(90, "A");
        check(89, "B");
        check(70, "C");
        check(69, "F");
    }

    static void check(int score, String expected) {
        String actual = grade(score);
        System.out.println(score + "점 → " + actual + " : " + (actual.equals(expected) ? "PASS" : "FAIL"));
    }
}
