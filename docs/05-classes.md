# 모듈 5. 클래스 기초

A트랙 예상 2시간 · 코드 위치: [src/module05/](../src/module05)

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 [predict/](../src/module05/predict) 3문제를 풀면 됩니다. P02(참조 복사)와 P03(String 비교)은 경험자도 자주 틀립니다.

지금까지는 숫자와 문자열만 다뤘습니다. 하지만 실제 프로그램이 다루는 것은 회원, 주문, 상품 같은 덩어리 데이터입니다. 클래스는 관련된 데이터(필드)와 동작(메서드)을 하나로 묶어 새로운 타입을 만드는 문법입니다. 이 모듈은 선수학습에서 가장 중요한 모듈입니다. 여기까지 오면 입과 준비의 절반 이상이 끝난 셈입니다.

## 학습 목표

- [ ] 클래스를 선언하고 new로 객체를 만들 수 있다
- [ ] 필드와 메서드, 생성자가 각각 무엇인지 안다
- [ ] 참조 변수가 "주소를 담는 변수"라는 것을 설명할 수 있다
- [ ] NullPointerException이 언제 나는지 알고, 스택트레이스를 읽을 수 있다
- [ ] String 비교에 ==가 아니라 equals를 쓰는 이유를 안다

## 핵심 요약

- 클래스는 설계도, 객체는 그 설계도로 만든 실물입니다. `new 클래스이름()`으로 만듭니다.
- 객체를 담는 변수는 객체 자체가 아니라 객체가 있는 곳의 주소(참조)를 담습니다. 변수를 복사하면 주소가 복사되어 둘이 같은 객체를 가리킵니다.
- null은 "아무것도 가리키지 않음"입니다. null인 변수에 점(.)을 찍으면 NullPointerException으로 죽습니다.
- 생성자는 new 할 때 실행되는 초기화 메서드입니다. 이름이 클래스와 같고 리턴 타입이 없습니다.
- this는 "지금 이 객체 자신"입니다. 매개변수와 필드의 이름이 같을 때 구분용으로 씁니다.
- static이 붙으면 객체가 아니라 클래스 소속입니다. 객체를 만들지 않고 씁니다.
- ==는 "같은 객체인가(주소 비교)", equals는 "내용이 같은가"입니다. 문자열 비교는 항상 equals.

## 1. 클래스 선언과 객체 생성

### 문법

```java
class 클래스이름 {
    타입 필드이름;        // 필드: 이 클래스가 가지는 데이터
    타입 필드이름;

    리턴타입 메서드이름() { // 메서드: 이 클래스가 할 수 있는 동작
        ...
    }
}

// 사용하는 쪽
클래스이름 변수 = new 클래스이름();   // 객체 생성
변수.필드이름 = 값;                  // 필드 접근은 점(.)
변수.메서드이름();                   // 메서드 호출도 점(.)
```

예를 들면:

```java
class Member {
    String name;
    int point;

    void printInfo() {
        System.out.println(name + " (" + point + "점)");
    }
}

Member m1 = new Member();   // 회원 객체 하나 생성
m1.name = "홍길동";
m1.point = 1200;
m1.printInfo();             // 홍길동 (1200점)

Member m2 = new Member();   // 또 하나. m1과는 완전히 별개
m2.name = "김영희";
```

알아둘 것:

- 클래스 이름은 대문자로 시작합니다(PascalCase). 변수, 메서드는 소문자 시작(camelCase). 이 관례만 지켜도 코드가 훨씬 읽기 쉬워집니다.
- 객체마다 필드를 따로 가집니다. m1의 name을 바꿔도 m2는 그대로입니다. predict/P01에서 확인합니다.
- 필드는 지역 변수와 달리 초기화하지 않으면 기본값을 가집니다. 숫자는 0, boolean은 false, String 같은 참조 타입은 null.
- 클래스 안의 메서드에 static이 없는 것에 주목하세요. 이런 메서드는 객체를 만들어야 부를 수 있습니다. 아래 5번에서 정리합니다.

실행해보기: [Ex01_Class.java](../src/module05/ex/Ex01_Class.java)

## 2. 참조: 변수에는 주소가 담긴다

`Member m1 = new Member();` 에서 실제 객체는 메모리 어딘가(힙이라고 부릅니다)에 만들어지고, 변수 m1에는 그 위치를 가리키는 주소만 담깁니다. 이 주소를 참조라고 합니다.

```java
Member a = new Member();
a.point = 100;

Member b = a;      // 객체가 복사되는 것이 아니라, '주소'가 복사된다
b.point = 999;

System.out.println(a.point);   // ? predict/P02에서 확인
```

- int를 복사하면 값이 복사되지만(모듈 4의 값 전달), 객체 변수를 복사하면 같은 객체를 둘이 가리키게 됩니다.
- `a == b`는 "같은 객체를 가리키는가"(주소 비교)입니다. 내용 비교가 아닙니다.

> 백엔드 미리보기: "복사한 줄 알았는데 같은 객체였다"는 실무 버그의 단골손님입니다. 여기서 감각을 잡아두면 두고두고 도움이 됩니다.

## 3. null과 NullPointerException

참조 변수가 아무 객체도 가리키지 않는 상태가 null입니다. null인 변수에 점(.)을 찍는 순간 프로그램은 NullPointerException(줄여서 NPE)을 던지며 죽습니다.

```java
Member m = null;
System.out.println(m.name);   // NullPointerException 발생, 프로그램 종료
```

에러가 나면 빨간 글씨로 이런 것이 출력됩니다.

```
Exception in thread "main" java.lang.NullPointerException: ...
    at module05.trace.T01_Npe.main(T01_Npe.java:27)
```

읽는 법: 무슨 일이 났는지(NullPointerException), 어느 파일 몇 번째 줄인지(T01_Npe.java:27). 이것을 스택트레이스라고 하고, 앞으로 수없이 만나게 됩니다. 에러가 나면 당황하지 말고 첫 줄과 내 코드가 있는 줄을 찾아 읽으세요. trace/T01에서 직접 겪어봅니다.

> 백엔드 미리보기: NPE는 자바 백엔드에서 가장 흔한 장애 원인입니다. "이 값이 null일 수 있는가"를 항상 의심하는 습관, 그리고 null이면 가드로 걸러내는 습관(모듈 4)이 짝을 이룹니다.

## 4. 생성자와 this

객체를 만들 때마다 필드를 한 줄씩 채우는 것은 번거롭고, 빠뜨려도 티가 안 납니다. 생성자는 new 할 때 실행되는 특별한 메서드로, 초기값을 강제할 수 있습니다.

### 문법

```java
class Member {
    String name;
    int point;

    // 생성자: 이름이 클래스와 같고, 리턴 타입을 쓰지 않는다
    Member(String name, int point) {
        this.name = name;     // this.name은 필드, name은 매개변수
        this.point = point;
    }
}

Member m = new Member("홍길동", 1200);   // 만들면서 바로 초기화
```

알아둘 것:

- 생성자를 하나도 안 만들면 자바가 매개변수 없는 기본 생성자를 몰래 만들어줍니다. 지금까지 `new Member()`가 됐던 이유입니다. 생성자를 직접 만들면 기본 생성자는 사라집니다.
- this는 "지금 이 객체 자신"을 가리킵니다. 매개변수와 필드 이름이 같을 때 `this.필드 = 매개변수`로 구분합니다.
- 생성자도 오버로딩할 수 있습니다(모듈 4).

실행해보기: [Ex02_Constructor.java](../src/module05/ex/Ex02_Constructor.java)

## 5. static: 객체 소속이 아니라 클래스 소속

- static이 없는 필드/메서드(인스턴스 멤버): 객체마다 따로 존재. 객체를 만들어야 쓸 수 있음.
- static이 붙은 필드/메서드(정적 멤버): 클래스에 하나만 존재. 객체 없이 `클래스이름.멤버`로 씀.

```java
class Counter {
    int count;                 // 객체마다 하나씩
    static int totalCount;     // 전체에서 딱 하나

    void increase() {
        count++;         // 내 것만 증가
        totalCount++;    // 공용 카운터 증가
    }
}
```

모듈 4에서 메서드마다 static을 붙였던 이유가 이제 설명됩니다. main이 static이라 객체 없이 실행되므로, main에서 바로 부르는 메서드도 static이어야 했던 것입니다. 앞으로 객체의 데이터(필드)를 다루는 메서드는 static 없이, 데이터와 무관한 도구성 메서드는 static으로 만들게 됩니다. `Math.random()`이 대표적인 static 메서드입니다.

실행해보기: [Ex03_Static.java](../src/module05/ex/Ex03_Static.java)

## 6. String의 == 와 equals

모듈 2에서 미뤄둔 숙제입니다. String도 객체이므로 ==는 주소 비교입니다. 내용 비교는 equals를 씁니다.

```java
String a = "java";
String b = new String("java");

a == b        // false (다른 객체)
a.equals(b)   // true  (내용이 같음)
```

함정이 하나 있는데, 따옴표로 만든 문자열끼리는 ==가 true가 나오기도 합니다(자바가 같은 리터럴을 재사용하기 때문). 그래서 ==로 짜도 한동안 동작하는 것처럼 보이다가, 입력값을 비교하는 순간 터집니다. 결론은 하나입니다. 문자열 비교는 항상 equals. predict/P03에서 직접 확인하세요.

## 문제 풀기

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [P01_TwoObjects.java](../src/module05/predict/P01_TwoObjects.java) | 객체는 각자의 필드를 가진다. 출력 예측 | 5분 |
| 2 | [P02_SameRef.java](../src/module05/predict/P02_SameRef.java) | 참조 복사의 함정 | 7분 |
| 3 | [P03_StringEquals.java](../src/module05/predict/P03_StringEquals.java) | == 와 equals | 7분 |
| 4 | [T01_Npe.java](../src/module05/trace/T01_Npe.java) | NPE를 직접 겪고, 스택트레이스를 읽고, 가드로 고치기 | 15분 |
| 5 | [W01_Member.java](../src/module05/make/W01_Member.java) | Member 클래스 완성. PASS가 뜨면 성공 | 20분 |

[solutions/](../src/module05/solutions)에 W01의 해설이 있습니다.

## AI와 함께 (선택, 5분)

클래스와 객체가 아직 흐릿하다면 이렇게 물어보세요.

> 자바의 클래스와 객체의 관계를 붕어빵 틀 말고 다른 비유 두 가지로 설명해줘. 그리고 "회원가입한 사용자 100만 명"은 클래스와 객체 중 무엇이 100만 개라는 뜻인지 물어보는 퀴즈를 포함해줘.

다음: [모듈 6. 배열 맛보기](06-arrays.md)
