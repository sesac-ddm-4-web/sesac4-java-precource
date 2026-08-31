package module06.solutions;

// [W01 해설] 합계와 최대값을 한 번의 반복으로 같이 구했습니다.
// 나눗셈에서 (double)로 변환하지 않으면 정수 나눗셈이 되어 소수점이 사라지는 것에 주의하세요.
public class W01_Solution {
    public static void main(String[] args) {
        int[] scores = {70, 95, 60, 88, 77};

        int max = scores[0];   // 일단 첫 값을 최고라고 둔다
        int sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;   // 더 큰 값을 만나면 교체
            }
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("최고 점수: " + max);
        System.out.println("평균: " + average);
    }
}
