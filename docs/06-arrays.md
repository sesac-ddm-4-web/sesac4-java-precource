# 모듈 6. 배열 맛보기

A트랙 예상 1시간 · 코드 위치: [src/module06/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module06)

> 경험자 최단 경로(B트랙): 아래 "핵심 요약"만 읽고 [predict/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module06/predict) 2문제를 풀면 됩니다.

값 100개를 변수 100개로 다룰 수는 없습니다. 배열은 같은 타입의 값 여러 개를 한 줄로 묶어 번호(인덱스)로 접근하는 가장 기본적인 자료구조입니다. 입과 후 바로 배우게 될 컬렉션(ArrayList, HashMap 등)의 출발점이기도 합니다. 여기서는 맛보기로 1차원 배열만 다룹니다.

## 학습 목표

- [ ] 배열을 만들고 인덱스로 읽고 쓸 수 있다
- [ ] 인덱스가 0부터 시작한다는 것과 length의 관계를 안다
- [ ] 배열과 반복문을 조합해 합계, 최대값을 구할 수 있다
- [ ] ArrayIndexOutOfBoundsException이 왜 나는지 안다

## 핵심 요약

- 생성: `int[] arr = new int[5];` (크기 고정, 기본값으로 채워짐) 또는 `int[] arr = {1, 2, 3};`
- 접근: `arr[0]`부터 시작. 마지막 칸은 `arr[arr.length - 1]`.
- `arr.length`는 칸의 개수. 범위를 벗어나면 ArrayIndexOutOfBoundsException.
- 전부 순회할 때는 향상된 for가 편합니다: `for (int x : arr) { ... }`
- 배열도 객체라서 변수에는 참조(주소)가 담깁니다. 모듈 5의 규칙 그대로입니다.

## 1. 배열 만들기와 접근하기

### 문법

```java
// 방법 1: 크기를 정해서 생성. 각 칸은 기본값(int는 0)으로 채워진다
int[] scores = new int[5];
scores[0] = 90;              // 첫 칸에 저장
scores[4] = 75;              // 마지막 칸 (크기가 5면 인덱스는 0~4)

// 방법 2: 값을 나열해서 생성
int[] primes = {2, 3, 5, 7, 11};
String[] menus = {"아메리카노", "라떼", "콜드브루"};

System.out.println(primes[2]);       // 5 (세 번째 값)
System.out.println(primes.length);   // 5 (칸의 개수)
```

알아둘 것:

- 인덱스는 0부터 시작합니다. 크기가 n이면 유효한 인덱스는 0부터 n-1까지입니다.
- `primes.length`처럼 length에는 괄호가 없습니다. (문자열의 `length()`에는 괄호가 있어서 처음엔 다들 헷갈립니다)
- 없는 칸에 접근하면 ArrayIndexOutOfBoundsException이 나며 죽습니다. 모듈 5의 NPE처럼, 스택트레이스에서 몇 번째 줄인지 읽으면 됩니다.
- 한 번 만든 배열의 크기는 바꿀 수 없습니다. 늘었다 줄었다 하는 목록이 필요하면 ArrayList를 쓰는데, 그것이 입과 후 첫 주에 배울 컬렉션입니다.

실행해보기: [Ex01_Array.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module06/ex/Ex01_Array.java)

## 2. 배열과 반복문

배열의 진가는 반복문과 만날 때 나옵니다.

```java
int[] scores = {70, 95, 60, 88, 77};

// 인덱스로 도는 for: 인덱스가 필요할 때
int sum = 0;
for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
}

// 향상된 for: 값만 필요할 때 (읽기 간결)
int sum2 = 0;
for (int score : scores) {
    sum2 += score;
}
```

- `i < scores.length` 조건에 주목하세요. `<=`로 쓰면 마지막에 없는 칸을 건드려 예외가 납니다. predict/P02에서 직접 확인합니다.
- 향상된 for는 "배열의 각 값을 score라는 이름으로 하나씩 꺼내며 돈다"로 읽습니다. 인덱스가 필요 없다면 이쪽이 실수할 여지가 적습니다.

> 백엔드 미리보기: "목록을 받아서, 돌면서, 조건에 맞는 것을 골라 계산한다"는 백엔드 로직의 기본 형태입니다. 주문 목록 합계, 회원 목록 필터링 전부 이 모양입니다.

## 문제 풀기

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [P01_IndexBasics.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module06/predict/P01_IndexBasics.java) | 인덱스, 기본값, length. 출력 예측 | 5분 |
| 2 | [P02_OutOfBounds.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module06/predict/P02_OutOfBounds.java) | 경계를 넘으면 생기는 일. 예측하고, 겪고, 고치기 | 10분 |
| 3 | [W01_Stats.java](https://github.com/lleellee0/sesac4-java-precource/blob/main/src/module06/make/W01_Stats.java) | 최고 점수와 평균 구하기. PASS가 뜨면 성공 | 15분 |

[solutions/](https://github.com/lleellee0/sesac4-java-precource/tree/main/src/module06/solutions)에 W01의 해설이 있습니다.

다음: [모듈 7. 미니 과제: 숫자 야구](https://github.com/lleellee0/sesac4-java-precource/blob/main/docs/07-final-project.md)
