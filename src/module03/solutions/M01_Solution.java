package module03.solutions;

import java.util.Scanner;

// [M01 해설] 미션 3까지 완성한 '한 가지' 예시입니다. 여러분의 코드와 달라도 괜찮습니다.
// 비교 포인트: ① 바깥 반복(단)과 안쪽 반복(1~9)의 역할 구분 ② 변수 이름이 의미를 담고 있는가
public class M01_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 단: ");
        int start = scanner.nextInt();
        System.out.print("끝 단: ");
        int end = scanner.nextInt();

        for (int dan = start; dan <= end; dan++) {
            System.out.println("=== " + dan + "단 ===");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }
    }
}
