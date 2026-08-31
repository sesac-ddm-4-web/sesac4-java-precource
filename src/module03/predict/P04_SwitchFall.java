package module03.predict;

/*
 * [예측 P04] switch에서 break가 없다면?
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 * 힌트: 예제 2(ex/Ex02_Switch)와 무엇이 다른지 먼저 찾아보세요.
 *
 * 내 예측:
 *   level이 2일 때 출력 →
 *   level을 3으로 바꾸면 →
 *
 * 실행 후 메모:
 *
 */
public class P04_SwitchFall {
    public static void main(String[] args) {
        int level = 2; // 회원 등급: 3=골드, 2=실버, 1=일반

        switch (level) {
            case 3:
                System.out.println("골드 혜택");
            case 2:
                System.out.println("실버 혜택");
            case 1:
                System.out.println("기본 혜택");
                break;
            default:
                System.out.println("혜택 없음");
        }

        // 실행 후 생각해보기:
        // 이 코드의 흘러내림(fall-through)은 사실 의도된 것일 수도 있습니다.
        // "높은 등급은 낮은 등급의 혜택도 모두 받는다"를 표현한 것일 수 있으니까요.
        // break를 일부러 뺀 코드를 실무에서 만나면, 버그인지 의도인지부터 의심하게 됩니다.
    }
}
