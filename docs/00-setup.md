# 모듈 0. 환경 셋업과 첫 프로그램

A트랙 예상 2.5시간 · 코드 위치: [src/module00/](../src/module00)

> 모든 트랙 공통입니다. 이미 환경이 갖춰져 있다면 아래 퀘스트의 7번(Hello 실행)만 확인하고 넘어가세요.

이 모듈은 다른 모듈과 다르게 "찾아서 해내는" 방식입니다. 설치 방법을 하나하나 알려주는 대신 목표와 확인 방법을 드릴 테니, 검색과 AI를 활용해서 직접 해결해보세요. 개발자의 일은 절반이 이런 식의 문제 해결이고, 이 과정 자체가 연습입니다. 물론 아래에 자주 막히는 지점 FAQ가 있으니 막히면 참고하세요.

## 퀘스트: 아래 7개를 순서대로 완료하세요

| # | 목표 | 완료 확인 방법 |
|---|---|---|
| 1 | GitHub 계정 만들기 | github.com 에 로그인이 된다 |
| 2 | Git 설치하기 | 터미널(Windows는 명령 프롬프트 또는 PowerShell)에서 `git --version` 을 입력하면 버전이 출력된다 |
| 3 | 이 저장소 내려받기(clone) | `git clone https://github.com/lleellee0/sesac4-java-precource.git` 실행 후, 내 컴퓨터에 폴더가 생겼다 |
| 4 | JDK 21 설치하기 | 터미널에서 `java -version` 과 `javac -version` 모두 21로 출력된다 |
| 5 | IntelliJ IDEA 설치하기 | IntelliJ가 실행된다. 무료 버전이면 충분합니다 (다운로드 페이지에서 Community 또는 무료 옵션을 고르세요) |
| 6 | IntelliJ로 이 저장소 열기 | 아래 "IntelliJ에서 열기"를 따라 하면 된다 |
| 7 | 첫 프로그램 실행하기 | `src/module00/ex/Hello.java` 를 실행해서 "Hello, backend!"가 출력된다 |

힌트가 필요할 때 쓸 검색어와 AI 질문 예시:

- "Windows Git 설치" / "Mac Git 설치 homebrew"
- "JDK 21 설치 Temurin" (JDK는 여러 회사가 배포합니다. Temurin, Oracle 어느 것이든 21 버전이면 됩니다)
- AI에게: "Windows에서 JDK 21을 설치하고 java -version이 되게 하는 과정을 순서대로 알려줘. 환경 변수 설정이 필요하면 그것도 포함해서."
- AI에게: "git clone이 뭔지 처음 쓰는 사람에게 설명해주고, 명령어 사용법을 알려줘."

## IntelliJ에서 열기

1. IntelliJ 실행 후 Open을 누르고, clone 받은 `sesac4-java-precource` 폴더를 선택합니다. ("Trust Project?" 창이 뜨면 Trust)
2. 왼쪽 파일 트리에서 `src` 폴더가 파란색이 아니라면: `src` 폴더에서 마우스 오른쪽 클릭, Mark Directory as, Sources Root 선택.
3. `src/module00/ex/Hello.java` 파일을 엽니다. 위쪽에 "Project SDK is not defined" 같은 노란 안내줄이 뜨면 Setup SDK를 눌러 설치한 JDK 21을 선택합니다.
4. 코드 안의 `main` 왼쪽에 있는 초록 화살표를 눌러 Run 하면, 아래 창에 실행 결과가 나옵니다.

이후 모든 문제 파일도 같은 방식으로 실행합니다: 파일을 열고, main 옆 초록 화살표를 누른다.

참고: 학습 문서 안의 파일 링크는 GitHub 웹에서 코드를 미리 보는 용도입니다. 실제 실행은 방금 IntelliJ로 연 내 컴퓨터의 같은 파일에서 합니다. 문서가 `src/module01/predict/P01_Division.java`를 가리키면, IntelliJ 왼쪽 트리에서 같은 경로를 찾아 여세요.

## 첫 프로그램 뜯어보기

실행해보기: [Hello.java](../src/module00/ex/Hello.java)

```java
package module00.ex;                          // 이 파일이 속한 폴더(패키지)

public class Hello {                          // 클래스: 자바 코드의 기본 그릇. 파일명과 같아야 함
    public static void main(String[] args) {  // main 메서드: 프로그램의 시작점. 이 모양 그대로 외워두세요
        System.out.println("Hello, backend!"); // 화면에 한 줄 출력하는 명령
    }
}
```

지금 단계에서 알아둘 것:

- 자바 프로그램은 항상 `main` 메서드부터 시작해서, 위에서 아래로 한 줄씩 실행됩니다.
- 하나의 실행문은 세미콜론(`;`)으로 끝납니다. 빼먹으면 컴파일 에러가 납니다.
- `System.out.println(...)`은 괄호 안의 내용을 출력하고 줄을 바꿉니다. `System.out.print(...)`는 줄을 바꾸지 않습니다.
- `//` 뒤의 내용은 주석입니다. 컴퓨터는 무시하고, 사람을 위해 남기는 메모입니다. 여러 줄 주석은 `/*` 와 `*/` 사이에 씁니다.
- `public class Hello` 나 `static` 같은 단어들의 정확한 의미는 모듈 4~5에서 배웁니다. 지금은 "프로그램의 틀"이라고만 알아두면 됩니다.

컴퓨터가 이 파일을 실행하는 원리도 한 줄만 알아두세요. 자바는 소스 코드(.java)를 컴파일러가 바이트코드(.class)로 번역하고, 그것을 JVM(자바 가상 머신)이 실행합니다. 그래서 자바 프로그램은 운영체제가 달라도 JVM만 있으면 똑같이 돌아갑니다. IntelliJ의 초록 화살표는 이 두 단계를 한 번에 해주는 버튼입니다.

## 문제 풀기

실행하기 전에 예측을 주석에 적고, 실행해서 비교하세요.

| 순서 | 파일 | 할 일 | 예상 |
|---|---|---|---|
| 1 | [P01_Print.java](../src/module00/predict/P01_Print.java) | println과 print의 차이, 실행 순서 | 5분 |
| 2 | [P02_Comments.java](../src/module00/predict/P02_Comments.java) | 주석은 실행되지 않는다 | 5분 |

## 자주 막히는 지점 FAQ

**Q. `java -version` 은 되는데 `javac -version` 이 안 됩니다.**
JDK가 아니라 JRE만 설치되었거나, 환경 변수(PATH)에 JDK 경로가 잡히지 않은 경우입니다. "JDK 환경 변수 설정 (본인 OS)"으로 검색하거나, 에러 메시지를 AI에게 그대로 붙여넣어 물어보세요.

**Q. IntelliJ에서 초록 화살표가 안 보입니다.**
`src`가 Sources Root로 지정되지 않은 경우가 대부분입니다. 위 "IntelliJ에서 열기" 2번을 확인하세요. 그래도 안 되면 File, Project Structure, Project 메뉴에서 SDK가 21로 잡혀 있는지 확인하세요.

**Q. 실행하면 "SDK is not defined" 또는 "Cannot start compiler" 라고 나옵니다.**
JDK 연결 문제입니다. File, Project Structure, Project에서 SDK를 설치한 JDK 21로 선택하세요.

**Q. 한글이 깨져 보입니다.**
Windows에서 종종 있습니다. File, Settings에서 "File Encodings"를 검색해 전부 UTF-8로 맞춰보세요.

**Q. git clone 하는 위치는 어디가 좋나요?**
경로에 한글이나 공백이 없는 폴더를 권합니다. 예: `C:\dev` 또는 `~/dev`. 사용자 이름이 한글인 Windows 계정에서는 바탕화면 대신 `C:\dev` 같은 별도 폴더를 만드는 것이 안전합니다.

**Q. 실행하려는 파일이 아닌 다른 파일에서 에러가 나면서 실행이 안 됩니다.**
자바는 실행 전에 프로젝트의 모든 파일을 컴파일합니다. 만들다 만 작성 과제(예: 모듈 1의 W01)에 문법 에러가 남아 있으면, 그 파일과 상관없는 다른 파일도 실행되지 않습니다. 에러 목록에 뜬 파일을 열어 고치거나, 문제가 되는 줄을 주석 처리하세요. 도저히 안 되면 그 파일만 GitHub의 원본 내용으로 되돌려도 됩니다.

**Q. 그 밖의 모든 에러.**
에러 메시지를 통째로 복사해서 AI에게 붙여넣고, 사용 중인 OS(Windows/Mac)와 "자바 초보자"라는 사실을 함께 알려주세요. 대부분 해결됩니다. 그래도 안 되면 공지에 안내된 문의 채널로 질문하세요.

다음: [모듈 1. 변수와 타입](01-variables.md)
