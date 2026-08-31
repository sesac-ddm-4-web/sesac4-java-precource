# 모듈 2. 연산자

A트랙 예상 1시간 · 코드 위치: [src/module02/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module02)

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 [predict/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module02/predict) 3문제를 풀면 됩니다. 오버플로 문제는 경험자도 자주 틀립니다.

연산자 자체는 수학 기호와 비슷해서 어렵지 않습니다. 이 모듈의 진짜 목적은 연산자 주변의 함정들, 그러니까 오버플로, 정수 나눗셈, 증감 연산자의 위치 같은 것들을 미리 밟아보는 것입니다.

## 학습 목표

- [ ] i++ 와 ++i 의 차이를 설명할 수 있다
- [ ] && 와 || 의 단락 평가(short-circuit)가 무엇인지 안다
- [ ] int가 최대값을 넘으면 무슨 일이 생기는지 안다
- [ ] 삼항 연산자를 읽고 쓸 수 있다

## 핵심 요약

- 산술: `+ - * / %`. 정수끼리 나누면 정수, `%`는 나머지.
- 증감: `i++`는 쓰고 나서 1 증가, `++i`는 1 증가하고 나서 사용.
- 비교: `== != > >= < <=`. 결과는 boolean.
- 논리: `&&`(그리고) `||`(또는) `!`(부정). 앞에서 결과가 정해지면 뒤는 계산하지 않음(단락 평가).
- 대입: `= += -= *= /=`. `a += 3`은 `a = a + 3`.
- 삼항: `조건 ? 참일 때 값 : 거짓일 때 값`.
- int 최대값(2147483647)을 넘으면 에러 없이 음수로 뒤집힘(오버플로).
- 우선순위를 외우기보다 괄호를 쓰세요. 읽는 사람도 편해집니다.

## 1. 산술 연산자와 증감 연산자

### 문법

```java
int a = 7, b = 2;
a + b   // 9
a - b   // 5
a * b   // 14
a / b   // 3  (정수끼리라서. 모듈 1에서 본 그 함정)
a % b   // 1  (나머지. 짝수/홀수 판별, 배수 판별에 자주 씀)

int i = 5;
i++;    // i를 1 증가 (i = i + 1 과 같음)
i--;    // i를 1 감소
```

증감 연산자는 위치에 따라 의미가 달라집니다.

```java
int i = 5;
System.out.println(i++);  // 5를 먼저 출력하고, 그다음 i가 6이 됨 (후위)
System.out.println(++i);  // i를 7로 만들고 나서 출력 (전위)
```

다른 식 안에 `i++`를 섞어 쓰면 읽기 어려운 코드가 됩니다. 반복문의 `i++`처럼 단독으로만 쓰는 것을 권합니다. 헷갈리는 경우들은 predict/P01에서 확인하세요.

## 2. 비교 연산자와 논리 연산자

### 문법

```java
int age = 20;
boolean isAdult = age >= 19;              // 비교 결과는 boolean

boolean hasCoupon = true;
boolean canDiscount = isAdult && hasCoupon;   // 둘 다 true여야 true
boolean needCheck = !isAdult || !hasCoupon;   // 하나라도 true면 true
```

알아둘 것:

- 같은지 비교는 `==`, 다른지 비교는 `!=` 입니다. 대입(`=`)과 헷갈리지 마세요.
- 문자열(String)은 `==`로 비교하면 안 되고 `equals`를 써야 합니다. 왜 그런지는 모듈 5에서 참조를 배우며 정확히 알게 됩니다. 지금은 규칙으로 기억하세요: `name.equals("admin")`.
- 단락 평가: `A && B`에서 A가 false면 B는 아예 실행하지 않습니다. `A || B`에서 A가 true여도 마찬가지입니다. predict/P02에서 직접 확인합니다.

> 백엔드 미리보기: 단락 평가는 null 검사에 매일 쓰입니다. `member != null && member.isActive()` 처럼 앞 조건이 뒤 조건을 보호하는 패턴입니다. 모듈 5에서 null을 배우면 다시 떠올려보세요.

## 3. 대입 연산자와 삼항 연산자

### 문법

```java
int point = 1000;
point += 500;   // point = point + 500  →  1500
point -= 200;   // 1300
point *= 2;     // 2600

// 삼항 연산자: 조건 ? 참일 때 값 : 거짓일 때 값
int fee = point >= 2000 ? 0 : 3000;
String label = fee == 0 ? "무료배송" : "유료배송";
```

삼항 연산자는 "값 하나를 조건에 따라 고를 때"만 쓰세요. 삼항 안에 삼항을 넣기 시작하면 if로 바꿀 때입니다.

## 4. 오버플로: 조용히 틀리는 에러

int가 담을 수 있는 최대값은 2147483647(약 21억)입니다. 이걸 넘기면 에러가 나는 게 아니라, 값이 음수로 뒤집힌 채 계속 실행됩니다. 에러가 안 나서 더 위험합니다.

```java
int max = 2147483647;      // Integer.MAX_VALUE
System.out.println(max + 1);   // ?  predict/P03에서 확인
```

- 곱셈은 특히 위험합니다. `100000 * 100000`은 100억이라 int를 넘칩니다.
- 계산 결과가 int를 넘을 수 있으면 long으로 계산하세요. `100000L * 100000` 처럼 한쪽에 L만 붙여도 됩니다.
- 실수 나눗셈에는 오버플로 대신 다른 세계가 있습니다. `5.0 / 0`은 Infinity, `0.0 / 0.0`은 NaN(Not a Number)이 나옵니다. 정수 `5 / 0`은 프로그램이 죽습니다(예외. 모듈이 아니라 본과정에서 다룹니다).

> 백엔드 미리보기: 조회수 합계, 누적 금액, 밀리초 타임스탬프. 전부 int를 넘기 쉬운 값들이라 실무에서는 long이 기본입니다.

## 비트 연산자에 대하여 (읽고 넘어가기)

`& | ^ ~ << >>` 같은 비트 연산자는 숫자를 2진수 비트 단위로 다루는 연산자입니다. 플래그 압축, 해시 계산, 성능이 극단적으로 중요한 코드에서 쓰이고, 코딩테스트의 일부 유형에도 나옵니다. 백엔드 일상 코드에서는 드물게 만나므로 지금은 "이런 게 있다"만 알고 넘어가면 됩니다. 필요해지는 시점(코테 트랙)에 다시 다룹니다.

## 문제 풀기

실행 전에 예측을 주석에 적고, 실행해서 비교하세요.

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [Ex01_IncDec.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/ex/Ex01_IncDec.java) | 예제: 증감 연산자 (읽고 실행) | 3분 |
| 2 | [Ex02_Ternary.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/ex/Ex02_Ternary.java) | 예제: 삼항 연산자 (읽고 실행) | 3분 |
| 3 | [P01_IncDec.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/predict/P01_IncDec.java) | 전위/후위 증감. 출력 예측 | 7분 |
| 4 | [P02_ShortCircuit.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/predict/P02_ShortCircuit.java) | 단락 평가 | 7분 |
| 5 | [P03_Overflow.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/predict/P03_Overflow.java) | 오버플로와 Infinity, NaN | 7분 |
| 6 | [T01_DiscountBug.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module02/trace/T01_DiscountBug.java) | 할인가가 이상하게 나오는 버그 찾아 고치기 | 10분 |

다음: [모듈 3. 조건문과 반복문](https://github.com/lleellee0/sesac4-java-precource/blob/main/docs/03-control-flow.md)
