package module05.predict;

/*
 * [예측 P03] String의 == 와 equals
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (4줄):
 *
 * 실행 후 메모:
 *
 */
public class P03_StringEquals {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(a.equals("JAVA"));

        // 실행 후 읽어보기:
        // a == b 가 true인 이유: 자바는 따옴표로 만든 같은 문자열(리터럴)을 재사용합니다.
        // 그래서 ==로 짜도 우연히 동작할 때가 있지만, new나 입력으로 만들어진
        // 문자열이 오는 순간 false가 됩니다. 결론: 문자열 비교는 항상 equals.
        // 대소문자 무시 비교가 필요하면 equalsIgnoreCase를 씁니다.
    }
}
