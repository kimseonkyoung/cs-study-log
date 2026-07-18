# Section 2 — String(문자열) — 13강 (2시간 5분)

## 강의 체크리스트
- [ ] 1. 문자 찾기 (16분)
- [ ] 2. 대소문자 변환 (8분)
- [ ] 3. 문장 속 단어(indexOf(), substring()) (12분)
- [ ] 4. 단어 뒤집기(StringBuilder 이용법) (15분)
- [ ] 5. 특정 문자 뒤집기(toCharArray()) (12분)
- [ ] 6. 중복문자제거 (10분)
- [ ] 7. 회문문자열 (7분)
- [ ] 8. 팰린드롬(replaceAll 정규식이용) (5분)
- [ ] 9. 숫자만 추출 (10분)
- [ ] 10. 문자자리 (15분)
- [ ] 11. 문자열 압축 (8분)
- [ ] 12. 암호(replace(), parseInt(string,2)) (6분)

## 개념 정리
<!-- 회사 세션: 강의 보면서 핵심 개념 + 예제 코드 정리 -->

### 0. 문자열 기본 도구 모음 (강의 1~2 대비 선행 정리, 2026-07-18)

#### 문자 접근 — String은 직접 인덱싱이 안 된다
```java
String s = "Hello";
char c = s.charAt(1);        // 'e' — i번째 문자 (s[1] 문법은 자바에 없음!)
int len = s.length();        // 5 — 배열은 .length(필드), 문자열은 .length()(메서드)

// 전체 순회 두 가지 방법
for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
}
for (char ch : s.toCharArray()) {   // char 배열로 변환 후 for-each
    // 수정이 필요하면 toCharArray()로 꺼내서 배열을 고친 뒤 new String(arr)
}
```

#### char는 사실상 숫자다 (아스키 연산)
```java
// 'A'=65 ... 'Z'=90, 'a'=97 ... 'z'=122  → 대문자가 소문자보다 32 작다
char c = 'd';
int order = c - 'a';         // 3 — 'a'로부터의 거리. 알파벳 순번 계산의 핵심
char up = (char)(c - 32);    // 'D' — 수동 대문자 변환 (뺄셈)
boolean isDigit = c >= '0' && c <= '9';   // 숫자 판별 (아스키 비교)
```

#### 판별·변환 — Character 클래스 (문자 1개용)
```java
Character.isDigit('7')       // true  — 숫자인가
Character.isAlphabetic('a')  // true  — 알파벳인가
Character.isUpperCase('A')   // true  — 대문자인가
Character.isLowerCase('a')   // true  — 소문자인가
Character.toUpperCase('a')   // 'A'   — 문자 1개 대문자로
Character.toLowerCase('A')   // 'a'   — 문자 1개 소문자로
```

#### 변환 — String 메서드 (문자열 전체용)
```java
s.toUpperCase();             // "HELLO" — 전체 대문자 (원본 불변, 새 문자열 반환!)
s.toLowerCase();             // "hello"
// 주의: s.toUpperCase()만 호출하고 결과를 안 받으면 아무 일도 안 일어남
s = s.toUpperCase();         // 이렇게 다시 대입해야 함 (String은 불변 immutable)
```

#### 검색 — indexOf, contains
```java
String str = "banana";
str.indexOf('n');            // 2  — 처음 나오는 위치, 없으면 -1
str.indexOf("na", 3);        // 4  — 3번 인덱스부터 검색
str.contains("nan");         // true — 있는지만 확인 (위치 불필요할 때)
```

#### 자르기 — substring (끝 인덱스는 미포함!)
```java
String str = "programmers";
str.substring(0, 3);         // "pro"  — [0, 3) 반쯤 열린 구간
str.substring(3);            // "grammers" — 3부터 끝까지
```

#### 비교 — ==는 금지, equals
```java
String a = "Kim";
String b = new String("Kim");
a == b                       // false! — 참조(주소) 비교
a.equals(b)                  // true  — 내용 비교. 문자열 비교는 무조건 equals
a.equalsIgnoreCase("KIM")    // true  — 대소문자 무시 비교
```

#### 조립 — StringBuilder (반복문에서 += 금지)
```java
// String은 불변이라 s += "x" 는 매번 새 문자열을 통째로 복사 → 반복문에서 O(n²)
StringBuilder sb = new StringBuilder();
sb.append("He").append('l'); // 문자열이든 문자든 append
sb.reverse();                // 뒤집기 — 문자열 뒤집기 문제의 치트키
sb.toString();               // 마지막에 String으로 변환
```

#### 미니 치트표 — 어떤 문제에 뭘 쓰나
| 하고 싶은 것 | 도구 |
|---|---|
| i번째 문자 | `charAt(i)` |
| 문자 하나가 숫자/대문자인지 | `Character.isDigit/isUpperCase` |
| 문자 하나 대↔소 변환 | `Character.toUpperCase/toLowerCase` |
| 문자열 전체 대↔소 변환 | `s.toUpperCase()` (재대입 필수) |
| 특정 단어 위치 | `indexOf` (없으면 -1) |
| 일부만 잘라내기 | `substring(시작, 끝미포함)` |
| 문자열 내용 비교 | `equals` (`==` 금지) |
| 반복하며 문자열 만들기 | `StringBuilder.append` |
| 알파벳 순번/시프트 계산 | `c - 'a'`, `% 26` |

### 실습 문제 (빈칸 채우기 — 안 보고 풀어보기)
```java
// Q1. "study1234"에서 숫자만 골라 출력 (기대: 1234)
String s = "study1234";
for (int i = 0; i < s.________; i++) {
    char c = s.________(i);
    if (Character.________(c)) System.out.print(c);
}

// Q2. 대문자는 소문자로, 소문자는 대문자로 뒤바꿔서 새 문자열 만들기
String t = "aBcD";
StringBuilder sb = new StringBuilder();
for (char c : t.____________()) {
    if (Character.isUpperCase(c)) sb.append(Character.____________(c));
    else sb.append(Character.____________(c));
}
// 기대: "AbCd"

// Q3. "Hello Kim"에서 "Kim"이 몇 번 인덱스에서 시작하는지 (기대: 6)
int idx = "Hello Kim".________("Kim");

// Q4. 'y'를 3칸 밀면? (순환 고려, 기대: 'b')
char shifted = (char)('a' + (('y' - 'a' + 3) % ____));
```


## 프로그래머스 추천 문제
<!-- 강의 진도에 맞춰 세부 강의별로 매핑해 추가 -->

**강의 1~2 (문자 찾기, 대소문자 변환) 대응 — 쉬운 순:**
- [ ] 문자열 다루기 기본 (lv1) — https://school.programmers.co.kr/learn/courses/30/lessons/12918 (문자 순회 + 판별)
- [ ] 서울에서 김서방 찾기 (lv1) — https://school.programmers.co.kr/learn/courses/30/lessons/12919 (indexOf 연습)
- [ ] 문자열 내림차순으로 배치하기 (lv1) — https://school.programmers.co.kr/learn/courses/30/lessons/12917 (정렬 + 아스키 대소문자 순서)
- [ ] 시저 암호 (lv1) — https://school.programmers.co.kr/learn/courses/30/lessons/12926 (대소문자 구분 변환 + 순환, 함정 많음)

## 문제풀이 회고
<!-- 집 세션에서 추가 -->
