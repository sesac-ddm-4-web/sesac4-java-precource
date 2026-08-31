# 모듈 1. 변수와 타입

A트랙 예상 2시간 · 코드 위치: [src/module01/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module01)

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 [predict/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module01/predict) 3문제를 풀면 됩니다. 정수 나눗셈과 실수 오차는 다른 언어 경험자도 자주 틀립니다.

변수는 값을 담아두는 이름표이고, 타입은 그 값의 종류입니다. 자바는 모든 변수에 타입을 미리 적어야 하는 언어라서, 타입을 읽을 줄 알면 코드의 절반이 읽힙니다.

## 학습 목표

- [ ] 변수를 선언하고 값을 넣고 바꿀 수 있다
- [ ] int, long, double, boolean, char, String을 언제 쓰는지 안다
- [ ] 자동 형변환과 강제 형변환의 차이를 설명할 수 있다
- [ ] 문자열과 숫자를 서로 변환할 수 있다
- [ ] Scanner로 키보드 입력을 받을 수 있다

## 핵심 요약

- 선언은 `타입 이름 = 값;`. 한 번 정한 타입은 바뀌지 않습니다.
- 정수는 int(기본), 아주 크면 long. 실수는 double. 참/거짓은 boolean. 한 글자는 char(작은따옴표), 문자열은 String(큰따옴표).
- 작은 타입에서 큰 타입으로는 자동 변환, 반대로는 `(타입)`을 붙이는 강제 변환이 필요하고 값이 잘릴 수 있습니다.
- 정수끼리의 나눗셈은 결과도 정수입니다. `7 / 2`는 3입니다.
- double은 근사값이라 `0.1 + 0.2 == 0.3`이 false입니다. 돈 계산에 double을 쓰면 안 됩니다.
- 문자열을 숫자로: `Integer.parseInt("123")`. 숫자를 문자열로: `String.valueOf(123)` 또는 `"" + 123`.
- 변수는 자신이 선언된 중괄호 `{}` 안에서만 살아 있습니다.

## 1. 변수 선언

### 문법

```java
타입 변수이름;           // 선언만
타입 변수이름 = 값;      // 선언과 동시에 값 넣기(초기화)

int age;                // 선언
age = 20;               // 값 대입
int price = 15000;      // 선언 + 초기화 (보통 이렇게 씁니다)
price = 12000;          // 값은 언제든 바꿀 수 있다 (그래서 '변수')
```

알아둘 것:

- 변수 이름은 소문자로 시작하고, 여러 단어면 두 번째 단어부터 대문자로 씁니다. 예: `totalPrice`, `memberCount`. (camelCase 규칙, 자바의 표준 관례입니다)
- 숫자로 시작할 수 없고, `int`, `class` 같은 자바 예약어는 이름으로 쓸 수 없습니다.
- 값을 넣지 않은 지역 변수를 사용하려고 하면 컴파일 에러가 납니다.
- 같은 이름의 변수를 같은 범위에서 두 번 선언할 수 없습니다.

## 2. 기본 타입

| 타입 | 담는 값 | 예시 | 메모 |
|---|---|---|---|
| int | 정수 (약 ±21억) | `int count = 10;` | 정수의 기본 선택 |
| long | 아주 큰 정수 | `long id = 10000000000L;` | 숫자 끝에 L. DB의 id 같은 값에 사용 |
| double | 실수 | `double rate = 0.15;` | 실수의 기본 선택. 근사값임에 주의 |
| boolean | true / false | `boolean isPaid = false;` | 조건문과 단짝 |
| char | 문자 1개 | `char grade = 'A';` | 작은따옴표 |
| String | 문자열 | `String name = "홍길동";` | 큰따옴표. 정확히는 기본 타입이 아니라 클래스지만, 지금은 같은 방식으로 쓰면 됩니다 |

- byte, short, float도 있지만 실무에서 보게 될 일이 훨씬 적습니다. 이름만 알아두세요.
- 21억이 커 보여도 서비스에서는 금방 넘습니다. 조회수, 금액 합계, id 같은 값은 long을 씁니다. int의 최대값을 넘어가면 무슨 일이 생기는지는 모듈 2에서 직접 봅니다.

## 3. 타입 변환 (형변환)

### 문법

```java
// 자동 변환: 작은 타입 → 큰 타입 (값 손실 없음, 그냥 대입하면 됨)
int a = 100;
long b = a;        // int → long, 자동
double c = a;      // int → double, 자동 (100.0)

// 강제 변환: 큰 타입 → 작은 타입 (값이 잘릴 수 있음, (타입) 필요)
double d = 3.99;
int e = (int) d;   // 3. 반올림이 아니라 소수점 아래를 버림
```

알아둘 것:

- 연산할 때도 변환이 일어납니다. int와 double을 섞어 계산하면 결과는 double입니다.
- 정수끼리 연산하면 결과도 정수입니다. `7 / 2`는 3.5가 아니라 3입니다. 3.5를 원하면 한쪽을 double로 만들어야 합니다: `7 / 2.0` 또는 `(double) 7 / 2`.
- char를 int에 대입하면 그 문자의 코드 번호가 들어갑니다. `'A'`는 65입니다.

### 문자열과 숫자 변환

```java
// 문자열 → 숫자
int n = Integer.parseInt("123");        // 123
double x = Double.parseDouble("3.5");   // 3.5

// 숫자 → 문자열
String s1 = String.valueOf(123);        // "123"
String s2 = "" + 123;                   // "123" (간편하지만 임시방편 느낌)

// 주의: + 는 문자열이 끼어 있으면 '이어붙이기'가 됩니다
System.out.println(1 + 2 + "3");   // ?
System.out.println("1" + 2 + 3);   // ?
```

마지막 두 줄의 답은 predict/P01에서 확인하세요. 왼쪽에서 오른쪽으로 계산된다는 것이 힌트입니다.

> 백엔드 미리보기: 웹에서 서버로 들어오는 값은 전부 문자열입니다. "나이: 25"도 처음엔 문자열 "25"로 도착합니다. parseInt 같은 변환은 백엔드 코드의 일상입니다.

## 4. 변수의 사용 범위

```java
public static void main(String[] args) {
    int outer = 1;
    {
        int inner = 2;
        System.out.println(outer);  // 가능
    }
    System.out.println(inner);      // 컴파일 에러: inner는 위 중괄호 안에서만 존재
}
```

변수는 자신이 선언된 중괄호 안에서만 쓸 수 있습니다. 나중에 if, for, 메서드가 나오면 이 규칙이 계속 적용됩니다.

## 5. 키보드 입력: Scanner

### 문법

```java
import java.util.Scanner;   // 파일 맨 위(package 아래)에 필요

Scanner scanner = new Scanner(System.in);

System.out.print("나이 입력: ");
int age = scanner.nextInt();        // 정수 하나 읽기

System.out.print("이름 입력: ");
String name = scanner.next();       // 공백 전까지의 한 단어 읽기
```

알아둘 것:

- `new Scanner(System.in)` 의 정확한 의미(new, 객체)는 모듈 5에서 배웁니다. 지금은 "입력 도구를 하나 만든다"로 충분합니다.
- nextInt는 정수, nextDouble은 실수, next는 한 단어를 읽습니다.
- 실행하면 프로그램이 입력을 기다리며 멈춰 있는 것처럼 보입니다. IntelliJ 아래 실행 창을 클릭하고 값을 입력한 뒤 Enter를 누르세요.

실행해보기: [Ex03_Scanner.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/ex/Ex03_Scanner.java)

## 문제 풀기

실행 전에 예측을 주석에 적고, 실행해서 비교하세요.

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [Ex01_Variables.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/ex/Ex01_Variables.java) | 예제: 선언과 타입 (읽고 실행) | 5분 |
| 2 | [Ex02_Casting.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/ex/Ex02_Casting.java) | 예제: 형변환 (읽고 실행) | 5분 |
| 3 | [P01_Division.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/predict/P01_Division.java) | 정수 나눗셈과 문자열 연결. 출력 예측 | 7분 |
| 4 | [P02_DoubleTrap.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/predict/P02_DoubleTrap.java) | 실수의 함정 | 5분 |
| 5 | [P03_Casting.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/predict/P03_Casting.java) | 형변환과 문자열 변환 | 7분 |
| 6 | [M01_AverageInput.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/modify/M01_AverageInput.java) | 동작하는 입력 코드를 요구사항에 맞게 수정 | 15분 |
| 7 | [W01_TimeFormat.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module01/make/W01_TimeFormat.java) | 직접 작성. 실행해서 PASS가 뜨면 성공 | 15분 |

[solutions/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module01/solutions)에 M01과 W01의 해설이 있습니다. 먼저 풀고 나서 비교하세요.

## AI와 함께 (선택, 5분)

이 모듈에서 가장 낯선 개념 하나를 골라(예: 형변환) AI에게 이렇게 물어보세요.

> 자바의 자동 형변환과 강제 형변환을 초등학생에게 설명하듯 비유로 설명해줘. 그다음 내가 이해했는지 확인할 퀴즈 2개를 내줘. 답은 바로 알려주지 말고.

설명을 듣는 것보다, 퀴즈에 답해보는 쪽이 남습니다.

다음: [모듈 2. 연산자](https://github.com/lleellee0/sesac4-java-precource/blob/main/docs/02-operators.md)
