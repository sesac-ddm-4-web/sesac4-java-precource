package module03.ex;

// [예제 3] while: 조건이 참인 동안 반복합니다. 몇 번 돌지 미리 알 수 없을 때 어울립니다.
// (do-while은 같은 구조인데, 본문을 '먼저 한 번' 실행하고 나서 조건을 봅니다)
public class Ex03_While {
    public static void main(String[] args) {
        int retry = 0;
        boolean connected = false;

        while (!connected && retry < 3) {
            retry++;
            System.out.println("서버 연결 시도 " + retry + "회...");
            if (retry == 3) {
                connected = true; // 3번째에 성공했다고 가정
            }
        }

        System.out.println("연결 " + (connected ? "성공" : "실패"));
    }
}
