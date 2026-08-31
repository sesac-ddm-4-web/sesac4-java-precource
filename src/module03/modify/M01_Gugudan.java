package module03.modify;

/*
 * [변형 M01] 구구단 프로그램 업그레이드
 *
 * 아래는 '3단'을 출력하는 완성된 프로그램입니다. 그대로 한 번 실행해보고 시작하세요.
 *
 * 미션 (하나 끝낼 때마다 실행해서 확인):
 *   1) 몇 단을 출력할지 사용자에게 입력받아서 그 단을 출력하기
 *      (모듈 1에서 배운 Scanner를 사용하세요. import는 이미 되어 있습니다)
 *   2) '시작 단'과 '끝 단'을 입력받아 그 범위의 단을 모두 출력하기 (반복문 안의 반복문)
 *   3) 단이 바뀔 때마다 "=== N단 ===" 제목 줄 출력하기
 *
 * 다 되면: solutions/M01_Solution.java 와 비교해보세요. 정답은 하나가 아닙니다.
 */
import java.util.Scanner;

public class M01_Gugudan {
    public static void main(String[] args) {
        int dan = 3;

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }
}
