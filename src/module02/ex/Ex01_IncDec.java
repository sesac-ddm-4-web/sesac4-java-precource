package module02.ex;

// [예제 1] 증감 연산자
// i++ 는 "쓰고 나서 증가", ++i 는 "증가하고 나서 사용"
public class Ex01_IncDec {
    public static void main(String[] args) {
        int visitors = 0;

        visitors++;   // 방문자 1명
        visitors++;   // 방문자 2명
        System.out.println("방문자 수: " + visitors);

        int i = 10;
        System.out.println(i++);   // 10을 출력하고 나서 11이 된다
        System.out.println(i);     // 11
        System.out.println(++i);   // 12로 만들고 나서 출력한다
    }
}
