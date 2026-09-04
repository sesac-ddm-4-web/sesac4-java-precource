package module01.make;

/*
 * [작성 W01] 초를 시:분:초로 바꾸기
 *
 * 서버 로그에는 "3735초 걸림" 같은 값이 자주 찍힙니다. 사람이 읽기 좋게 바꿔봅시다.
 *
 * 할 일:
 *   totalSeconds(3735초)를 시간, 분, 초로 나눠서
 *   변수 result에 "1시간 2분 15초" 형태의 문자열을 만들어 넣으세요.
 *
 * 힌트:
 *   - 1시간은 3600초, 1분은 60초입니다.
 *   - 나눗셈(/)은 몫을, 나머지 연산(%)은 나머지를 줍니다.
 *     예: 3735 / 3600 은 1 (시간), 3735 % 3600 은 135 (남은 초)
 *   - 숫자와 문자열을 + 로 이어 붙일 수 있습니다.
 *
 * 아래 검증 코드가 PASS를 출력하면 성공입니다. (검증 코드는 수정하지 마세요)
 * 검증 코드에는 아직 배우지 않은 문법이 섞여 있을 수 있습니다. 읽지 못해도 괜찮고, 수정만 하지 않으면 됩니다.
 * 막히면 15분까지만 고민하고 solutions/W01_Solution.java 를 열어보세요.
 */
public class W01_TimeFormat {
    public static void main(String[] args) {
        int totalSeconds = 3735;
        String result = "";

        // ===== 여기부터 작성 =====



        // ===== 여기까지 작성 =====

        // ----- 검증 (수정 금지) -----
        String expected = "1시간 2분 15초";
        if (result.equals(expected)) {
            System.out.println("PASS - 변환이 정확합니다!");
        } else {
            System.out.println("FAIL - 아직 기대값과 다릅니다");
            System.out.println("내 결과: " + result);
            System.out.println("기대값 : " + expected);
        }
    }
}
