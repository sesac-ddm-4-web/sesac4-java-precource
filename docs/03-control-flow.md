# 모듈 3. 조건문과 반복문

A트랙 예상 2시간 · 코드 위치: `src/module03/`

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 `predict/` 4문제를 푼 뒤 체크포인트로 가면 됩니다.

프로그램은 위에서 아래로 흐르지만, 실무 코드의 절반은 그 흐름을 꺾는 일입니다. 조건에 따라 갈라지고(분기), 같은 일을 되풀이합니다(반복). 입과 후에 만날 서버 코드도 결국 "요청이 올 때마다(반복) 상황에 맞게 처리하는(분기)" 프로그램입니다.

## 학습 목표

끝나면 아래 항목을 체크해보세요.

- [ ] if / else if / else 에서 조건의 순서가 결과를 바꾸는 이유를 설명할 수 있다
- [ ] switch 에서 break 를 빼먹으면 무슨 일이 생기는지 안다
- [ ] for / while / do-while 중 무엇을 쓸지 고르는 기준을 말할 수 있다
- [ ] break 와 continue 의 차이를 예를 들어 설명할 수 있다

## 핵심 요약

- if, else if, else는 위에서부터 검사해서 처음 참이 되는 블록 하나만 실행합니다.
- switch는 값 하나로 여러 갈래를 나눕니다. break가 없으면 아래 case까지 이어서 실행됩니다(fall-through).
- for는 반복 횟수가 보일 때, while은 몇 번일지 모를 때, do-while은 최소 한 번은 실행해야 할 때 씁니다.
- break는 반복 자체를 끝내고, continue는 이번 회차만 건너뜁니다.
- 자바 21에는 switch의 화살표(`->`) 문법과 패턴 매칭도 있습니다. 입과 후에 다룹니다.

## 개념

### 1. if: 위에서부터, 처음 걸리는 곳 하나만

실행해보기: `src/module03/ex/Ex01_If.java`

```java
int amount = 120000; // 주문 금액

if (amount >= 100000) {
    System.out.println("무료 배송");
} else if (amount >= 50000) {
    System.out.println("배송비 50% 할인");
} else {
    System.out.println("배송비 3,000원");
}
```

amount가 120000이므로 첫 조건에서 이미 참입니다. 아래 조건들은 검사조차 하지 않습니다. 그래서 넓은 조건을 위에 두면 아래 분기는 영원히 실행되지 않을 수 있습니다. predict/P01에서 직접 확인합니다.

> 백엔드 미리보기: 실무 코드에는 "잘못된 요청이면 먼저 걸러내고 끝낸다"는 패턴(가드 절)이 정말 많습니다. 조건의 순서를 설계하는 감각이 그 출발점입니다.

### 2. switch: 값 하나로 여러 갈래

실행해보기: `src/module03/ex/Ex02_Switch.java`

```java
String method = "POST"; // HTTP 요청의 종류. 입과 후 매일 만나게 됩니다.

switch (method) {
    case "GET":    System.out.println("데이터를 조회합니다"); break;
    case "POST":   System.out.println("데이터를 생성합니다"); break;
    case "DELETE": System.out.println("데이터를 삭제합니다"); break;
    default:       System.out.println("지원하지 않는 요청입니다");
}
```

break가 각 갈래의 마침표입니다. 빼먹으면 어떻게 되는지는 predict/P04에서 직접 확인하세요.

### 3. while / do-while: 몇 번일지 모를 때

실행해보기: `src/module03/ex/Ex03_While.java`

```java
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
```

"성공할 때까지, 최대 3번". 이렇게 반복 횟수가 상황에 달려 있을 때는 while이 어울립니다. do-while은 같은 구조인데 본문을 먼저 한 번 실행한 뒤에 조건을 봅니다. 메뉴를 일단 한 번은 보여줘야 하는 프로그램에서 자주 씁니다.

> 백엔드 미리보기: 서버는 사실 거대한 반복문입니다. "요청을 기다린다, 처리한다"를 무한히 반복하죠. 무한 루프는 버그이기도 하지만(trace/T01), 의도된 설계이기도 합니다.

### 4. for: 횟수가 보일 때 (+ break, continue)

실행해보기: `src/module03/ex/Ex04_For.java`

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // 3만 건너뛰고 반복은 계속
    }
    System.out.println(i + "번째 작업 처리");
}
```

## 문제 풀기

여기가 이 모듈의 본편입니다. 규칙을 다시 한 번: 실행 전에 예측을 주석에 적고, 실행하고, 다르면 이유를 한 줄 적습니다.

| 순서 | 파일 (`src/module03/`) | 할 일 | 예상 |
|---|---|---|---|
| 1 | `predict/P01_IfOrder` | 조건 순서의 함정. 출력 예측 | 5분 |
| 2 | `predict/P02_ForSum` | 반복의 흐름 따라가기 | 7분 |
| 3 | `predict/P03_LoopExit` | break, continue 조합 | 7분 |
| 4 | `predict/P04_SwitchFall` | break 없는 switch | 5분 |
| 5 | `trace/T01_FindBug` | 끝나지 않는 프로그램의 원인을 찾아 고치기 (주의: 실행하면 멈추지 않는 것이 정상입니다. IntelliJ의 빨간 정지 버튼으로 꺼주세요) | 10분 |
| 6 | `modify/M01_Gugudan` | 동작하는 코드를 요구사항에 맞게 업그레이드 | 15분 |
| 7 | `make/W01_OpsSchedule` | 직접 작성. 실행해서 PASS가 뜨면 성공 | 20분 |

`solutions/` 폴더에 M01과 W01의 해설이 있습니다. 먼저 풀고 나서 비교하세요. 정답은 하나가 아닙니다.

## AI와 함께 (선택, 10분)

아래처럼 중첩이 깊은 코드를 AI에게 주고 "동작은 그대로 두고 더 읽기 쉽게 바꿔줘"라고 요청해보세요.

```java
int age = 25;
int point = 1500;
boolean banned = false;

if (age >= 19) {
    if (point >= 1000) {
        if (!banned) {
            System.out.println("구매 가능");
        }
    }
}
```

바뀐 결과에서 관찰할 것 두 가지: ① 조건이 어떻게 뒤집혔나(안 되는 경우를 먼저 걸러내기) ② 중첩 깊이가 어떻게 줄었나. 이 감각은 입과 후 코드 리뷰에서 계속 쓰게 됩니다.

## 체크포인트

{폼1 링크} 의 "모듈 3" 섹션을 제출하세요. 재제출할 수 있고 점수는 없습니다.

## 더 깊게

입과 후 교재 『이것이 자바다』 4장이 이 모듈의 내용을 깊게 다룹니다.
