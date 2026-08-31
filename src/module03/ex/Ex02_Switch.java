package module03.ex;

// [예제 2] switch
// 하나의 값으로 여러 갈래를 나눕니다. 각 case 끝의 break가 갈래의 마침표입니다.
// method 값을 "GET", "PATCH" 등으로 바꿔 다시 실행해보세요.
public class Ex02_Switch {
    public static void main(String[] args) {
        String method = "POST"; // HTTP 요청의 종류. 입과 후 매일 만나게 됩니다

        switch (method) {
            case "GET":
                System.out.println("데이터를 조회합니다");
                break;
            case "POST":
                System.out.println("데이터를 생성합니다");
                break;
            case "DELETE":
                System.out.println("데이터를 삭제합니다");
                break;
            default:
                System.out.println("지원하지 않는 요청입니다");
        }
    }
}
