package module01.ex;

// [예제 2] 형변환
// 작은 타입에서 큰 타입으로는 자동, 반대로는 (타입)을 붙여야 하고 값이 잘릴 수 있습니다.
public class Ex02_Casting {
    public static void main(String[] args) {
        int a = 100;
        long b = a;          // 자동 변환 (int → long)
        double c = a;        // 자동 변환 (int → double)
        System.out.println(b);
        System.out.println(c);

        double price = 1999.99;
        int truncated = (int) price;   // 강제 변환. 소수점 아래를 버린다 (반올림 아님)
        System.out.println(truncated);

        System.out.println(7 / 2);            // 정수끼리 나누면 정수
        System.out.println(7 / 2.0);          // 한쪽이 실수면 실수
        System.out.println((double) 7 / 2);   // 강제 변환으로도 가능
    }
}
