package module03.solutions;

// [W01 해설] 핵심은 두 가지입니다.
//   ① 조건의 순서: 공배수("cache+db")를 먼저 검사하지 않으면 3의 배수에서 먼저 걸립니다.
//   ② 문자열 이어붙이기: 쉼표는 두 번째 항목부터 앞에 붙입니다.
public class W01_Solution {
    public static void main(String[] args) {
        String result = "";

        for (int day = 1; day <= 15; day++) {
            String task;
            if (day % 15 == 0) {          // 3과 5의 공배수를 '먼저' 검사
                task = "cache+db";
            } else if (day % 3 == 0) {
                task = "cache";
            } else if (day % 5 == 0) {
                task = "db";
            } else {
                task = "" + day;          // 숫자를 문자열로
            }

            System.out.println(day + "일: " + task);

            if (day > 1) {
                result = result + ",";
            }
            result = result + task;
        }

        String expected = "1,2,cache,4,db,cache,7,8,cache,db,11,cache,13,14,cache+db";
        System.out.println(result.equals(expected) ? "PASS" : "FAIL");
    }
}
