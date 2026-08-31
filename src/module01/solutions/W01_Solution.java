package module01.solutions;

// [W01 해설] 몫(/)과 나머지(%)를 단계적으로 쓰는 것이 핵심입니다.
public class W01_Solution {
    public static void main(String[] args) {
        int totalSeconds = 3735;
        String result = "";

        int hours = totalSeconds / 3600;          // 1
        int remaining = totalSeconds % 3600;      // 135
        int minutes = remaining / 60;             // 2
        int seconds = remaining % 60;             // 15

        result = hours + "시간 " + minutes + "분 " + seconds + "초";

        String expected = "1시간 2분 15초";
        System.out.println(result.equals(expected) ? "PASS" : "FAIL");
        System.out.println(result);
    }
}
