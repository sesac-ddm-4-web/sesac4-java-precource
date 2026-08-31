package module06.ex;

// [예제 1] 배열 만들기와 접근
public class Ex01_Array {
    public static void main(String[] args) {
        // 방법 1: 크기를 정해서 생성 (int의 기본값 0으로 채워진다)
        int[] dailyVisitors = new int[7];   // 일주일치 방문자 수
        dailyVisitors[0] = 120;             // 월요일
        dailyVisitors[1] = 95;              // 화요일
        dailyVisitors[6] = 210;             // 일요일 (크기 7이면 인덱스는 0~6)

        System.out.println("월요일: " + dailyVisitors[0]);
        System.out.println("수요일: " + dailyVisitors[2]);   // 값을 안 넣었으면?
        System.out.println("칸 수: " + dailyVisitors.length);

        // 방법 2: 값을 나열해서 생성
        String[] menus = {"아메리카노", "라떼", "콜드브루"};
        System.out.println("두 번째 메뉴: " + menus[1]);
    }
}
