package module03.ex;

// [예제 4] for: 반복 횟수가 눈에 보일 때 씁니다.
// break는 반복 자체를 끝내고, continue는 이번 회차만 건너뜁니다.
public class Ex04_For {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // 3만 건너뛰고 반복은 계속
            }
            System.out.println(i + "번째 작업 처리");
        }

        for (int i = 1; i <= 100; i++) {
            if (i * i > 50) {
                System.out.println("제곱이 50을 넘는 첫 번째 수: " + i);
                break; // 찾았으니 더 돌 필요가 없다
            }
        }
    }
}
