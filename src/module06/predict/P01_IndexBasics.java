package module06.predict;

/*
 * [예측 P01] 인덱스, 기본값, length
 *
 * 규칙: ① 실행 전에 '내 예측'을 먼저 적는다 → ② 실행한다 → ③ 다르면 이유를 한 줄 적는다
 *
 * 내 예측 (5줄):
 *
 * 실행 후 메모:
 *
 */
public class P01_IndexBasics {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr.length);

        int[] b = {5, 6, 7, 8};
        System.out.println(b[3]);
        System.out.println(b[b.length - 1]);
    }
}
