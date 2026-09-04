# 모듈 3. 조건문과 반복문

A트랙 예상 2시간 · 코드 위치: [src/module03/](../src/module03)

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 [predict/](../src/module03/predict) 4문제를 풀면 됩니다.

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

## 1. if 문

### 문법

```java
if (조건식) {
    // 조건식이 true일 때 실행
}

if (조건식) {
    // true일 때 실행
} else {
    // false일 때 실행
}

if (조건식1) {
    // 조건식1이 true일 때
} else if (조건식2) {
    // 조건식1이 false이고, 조건식2가 true일 때
} else {
    // 모두 false일 때
}
```

알아둘 것:

- 조건식 자리에는 결과가 boolean(true/false)인 식만 올 수 있습니다. `if (1)` 처럼 숫자를 넣으면 컴파일 에러입니다. (일부 다른 언어와 다른 점입니다)
- else if는 몇 개든 이어 붙일 수 있고, else는 생략할 수 있습니다.
- 검사는 항상 위에서부터, 처음 true가 나온 블록 하나만 실행하고 전체 if 문을 빠져나갑니다.
- 실행문이 한 줄이면 중괄호 `{}`를 생략할 수 있지만, 이 자료에서는 항상 붙입니다. 생략한 상태에서 줄을 추가하다가 생기는 버그가 많습니다.
- if 안에 if를 넣을 수 있습니다(중첩). 3단 이상 깊어지면 코드를 다시 설계하라는 신호로 받아들이세요.

### 예제

실행해보기: [Ex01_If.java](../src/module03/ex/Ex01_If.java)

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

## 2. switch 문

### 문법

```java
switch (비교할 값) {
    case 값1:
        // 비교할 값이 값1과 같을 때 실행
        break;
    case 값2:
        // 비교할 값이 값2와 같을 때 실행
        break;
    default:
        // 어느 case에도 해당하지 않을 때 실행
}
```

알아둘 것:

- 비교할 값으로는 int, char, String 등을 쓸 수 있습니다(enum이라는 타입도 가능한데, 본과정에서 배웁니다). long, double은 쓸 수 없습니다.
- case 뒤에는 변하지 않는 값(상수)만 올 수 있습니다. `case x > 10:` 같은 조건식은 안 됩니다. 범위 비교가 필요하면 if를 쓰세요.
- break를 만나면 switch 전체를 빠져나갑니다. break가 없으면 다음 case의 코드까지 이어서 실행됩니다. 이것을 fall-through(흘러내림)라고 부릅니다.
- default는 생략할 수 있고, 관례상 마지막에 둡니다.

### 예제

실행해보기: [Ex02_Switch.java](../src/module03/ex/Ex02_Switch.java)

```java
String method = "POST"; // HTTP 요청의 종류. 입과 후 매일 만나게 됩니다.

switch (method) {
    case "GET":    System.out.println("데이터를 조회합니다"); break;
    case "POST":   System.out.println("데이터를 생성합니다"); break;
    case "DELETE": System.out.println("데이터를 삭제합니다"); break;
    default:       System.out.println("지원하지 않는 요청입니다");
}
```

break를 빼먹으면 어떻게 되는지는 predict/P04에서 직접 확인하세요.

## 3. while 문과 do-while 문

### 문법

```java
while (조건식) {
    // 조건식이 true인 동안 반복 실행
}

do {
    // 일단 한 번 실행하고, 그다음부터 조건식이 true인 동안 반복
} while (조건식);
```

알아둘 것:

- 조건식이 처음부터 false라면 while의 본문은 0번, do-while의 본문은 1번 실행됩니다. 이것이 둘의 유일한 차이입니다.
- do-while은 끝의 세미콜론(`;`)을 빼먹기 쉬우니 주의하세요.
- 본문 안에서 조건식에 영향을 주는 값이 바뀌지 않으면 영원히 반복됩니다(무한 루프). trace/T01에서 직접 겪어봅니다.
- 의도적인 무한 반복이 필요할 때는 `while (true)`를 쓰고, 안에서 break로 빠져나옵니다.

### 예제

실행해보기: [Ex03_While.java](../src/module03/ex/Ex03_While.java)

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

"성공할 때까지, 최대 3번". 이렇게 반복 횟수가 상황에 달려 있을 때는 while이 어울립니다.

> 백엔드 미리보기: 서버는 사실 거대한 반복문입니다. "요청을 기다린다, 처리한다"를 무한히 반복하죠. 무한 루프는 버그이기도 하지만, 의도된 설계이기도 합니다.

## 4. for 문

### 문법

```java
for (초기식; 조건식; 증감식) {
    // 반복할 내용
}

// 예: i가 0부터 4까지, 5번 반복
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

실행 순서를 정확히 알아두세요.

1. 초기식을 실행합니다. (처음 한 번만)
2. 조건식을 검사합니다. false면 즉시 종료합니다.
3. true면 본문을 실행합니다.
4. 증감식을 실행합니다.
5. 다시 2번으로 돌아갑니다.

알아둘 것:

- `for (int i = 0; ...)` 처럼 초기식에서 선언한 변수 i는 그 for 문 안에서만 쓸 수 있습니다. for가 끝난 뒤에 i를 쓰면 컴파일 에러입니다.
- 반복 횟수 세는 습관: `i = 0; i < n` 이면 n번, `i = 1; i <= n` 이면 n번입니다. 경계(`<`와 `<=`)를 헷갈려서 한 번 더 돌거나 덜 도는 실수가 정말 흔합니다. predict/P02에서 확인합니다.
- for 안에 for를 넣을 수 있습니다(중첩 반복). modify/M01의 구구단에서 연습합니다.

### break와 continue

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // 이번 회차만 건너뛰고 다음 회차로
    }
    if (i == 5) {
        break;    // 반복 자체를 종료
    }
    System.out.println(i);
}
```

- 둘 다 반복문 안에서만 쓸 수 있습니다.
- 반복문이 중첩되어 있으면 가장 안쪽 반복문에만 적용됩니다.

실행해보기: [Ex04_For.java](../src/module03/ex/Ex04_For.java)

## 문제 풀기

여기가 이 모듈의 본편입니다. 규칙을 다시 한 번: 실행 전에 예측을 주석에 적고, 실행하고, 다르면 이유를 한 줄 적습니다.

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [P01_IfOrder.java](../src/module03/predict/P01_IfOrder.java) | 조건 순서의 함정. 출력 예측 | 5분 |
| 2 | [P02_ForSum.java](../src/module03/predict/P02_ForSum.java) | 반복의 흐름 따라가기 | 7분 |
| 3 | [P03_LoopExit.java](../src/module03/predict/P03_LoopExit.java) | break, continue 조합 | 7분 |
| 4 | [P04_SwitchFall.java](../src/module03/predict/P04_SwitchFall.java) | break 없는 switch | 5분 |
| 5 | [T01_FindBug.java](../src/module03/trace/T01_FindBug.java) | 끝나지 않는 프로그램의 원인을 찾아 고치기 (주의: 실행하면 멈추지 않는 것이 정상입니다. IntelliJ의 빨간 정지 버튼으로 꺼주세요) | 10분 |
| 6 | [M01_Gugudan.java](../src/module03/modify/M01_Gugudan.java) | 동작하는 코드를 요구사항에 맞게 업그레이드 | 15분 |
| 7 | [W01_OpsSchedule.java](../src/module03/make/W01_OpsSchedule.java) | 직접 작성. 실행해서 PASS가 뜨면 성공 | 20분 |

[solutions/](../src/module03/solutions) 폴더에 M01과 W01의 해설이 있습니다. 먼저 풀고 나서 비교하세요. 정답은 하나가 아닙니다.

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

다음: [모듈 4. 메서드](04-methods.md)
