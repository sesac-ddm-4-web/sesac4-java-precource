package module05.trace;

/*
 * [버그 찾기 T01] NullPointerException을 직접 겪어보기
 *
 * 회원 아이디로 등급을 출력하는 프로그램입니다.
 * "admin"을 조회할 때는 잘 되는데, "guest"를 조회하면 죽습니다.
 *
 * 미션:
 *   1) 일단 그대로 실행해서 빨간 에러(스택트레이스)를 관찰하세요.
 *      첫 줄에서 '무슨 예외인지', 그 아래에서 '내 코드 몇 번째 줄인지'를 찾아 읽어보세요.
 *   2) 왜 죽는지 코드를 읽으며 설명해보세요. (힌트: findMember가 무엇을 리턴했을까요?)
 *   3) main에 가드를 추가해서, 없는 회원이면 "존재하지 않는 회원입니다"를
 *      출력하고 죽지 않게 고치세요.
 *
 * 내가 읽은 스택트레이스 (예외 이름, 파일:줄):
 *
 * 내가 찾은 원인:
 *
 */
public class T01_Npe {
    public static void main(String[] args) {
        Member admin = findMember("admin");
        System.out.println("admin 등급: " + admin.grade);

        Member guest = findMember("guest");
        System.out.println("guest 등급: " + guest.grade);
    }

    // 아는 회원이면 객체를, 모르는 회원이면 null을 돌려준다.
    // 실무의 조회 코드도 "없으면 null" 형태가 흔합니다.
    static Member findMember(String id) {
        if (id.equals("admin")) {
            Member m = new Member();
            m.grade = "관리자";
            return m;
        }
        return null;
    }
}

class Member {
    String grade;
}
