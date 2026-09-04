package module03.make;

/*
 * [작성 W01] 서버 점검 스케줄표. 이 모듈의 직접 작성 과제입니다.
 *
 * 운영 규칙: 1일부터 15일까지, 날짜마다 할 일이 정해져 있습니다.
 *   - 3의 배수인 날: 캐시 정리            → "cache"
 *   - 5의 배수인 날: DB 백업              → "db"
 *   - 3과 5의 공배수인 날: 둘 다          → "cache+db"
 *   - 그 외의 날: 할 일 없음              → 날짜 숫자 (예: "1")
 *
 * 할 일:
 *   day가 1부터 15까지 도는 반복문을 만들고, 각 날의 결과를
 *   ① System.out.println으로 한 줄씩 출력하고
 *   ② 변수 result에 쉼표(,)로 이어 붙이세요.
 *
 * 힌트:
 *   - "cache+db"를 '먼저' 검사해야 합니다. 왜인지 생각해보세요. (P01에서 배운 것)
 *   - 쉼표는 두 번째 항목부터 '앞에' 붙이면 깔끔합니다. (day가 1보다 클 때)
 *   - 숫자를 문자열에 붙이기: result = result + day;
 *
 * 아래 검증 코드가 PASS를 출력하면 성공입니다. (검증 코드는 수정하지 마세요)
 * 검증 코드에는 아직 배우지 않은 문법이 섞여 있을 수 있습니다. 읽지 못해도 괜찮고, 수정만 하지 않으면 됩니다.
 * 막히면 20분까지만 고민하고 solutions/W01_Solution.java 를 열어보세요.
 */
public class W01_OpsSchedule {
    public static void main(String[] args) {
        String result = "";

        // ===== 여기부터 작성 =====



        // ===== 여기까지 작성 =====

        // ----- 검증 (수정 금지) -----
        String expected = "1,2,cache,4,db,cache,7,8,cache,db,11,cache,13,14,cache+db";
        if (result.equals(expected)) {
            System.out.println("PASS - 스케줄표가 정확합니다!");
        } else {
            System.out.println("FAIL - 아직 기대값과 다릅니다");
            System.out.println("내 결과: " + result);
            System.out.println("기대값 : " + expected);
        }
    }
}
