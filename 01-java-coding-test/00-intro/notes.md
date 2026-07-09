# Week 1 — 기초 (시간복잡도 / 문자열 / 정렬 / 이분탐색)

## 1. 시간복잡도 판단 요령

컴퓨터는 1초에 약 1억(10^8)번 연산 가능하다고 가정하고, 문제의 N과 제한시간을 보고
내 코드의 연산 횟수가 이를 넘는지 체크한다.

"완전탐색"은 특정 복잡도가 아니라 전략일 뿐이며, 방식(순열/부분집합/단순순회)에 따라
감당 가능한 N이 다르다.

| 복잡도 | N 크기 | 예시 |
|---|---|---|
| O(N!), O(2^N) | N≤10~20 | 순열/부분집합 완전탐색 |
| O(N³) | N≤500 | 삼중 for문 |
| O(N²) | N≤5,000 | 이중 for문 |
| O(N log N) | N≤1,000,000 | 정렬 |
| O(N) | N≤10,000,000 | 단순 순회 |

**연습 예제:** N=1000일 때 아래 코드가 몇 번 연산하고 실행 가능한지 판단해보기
```java
int count = 0;
for (int i = 0; i < n; i++)
    for (int j = i; j < n; j++)
        for (int k = 0; k < n; k++)
            count++;
System.out.println(count);
// TODO: 직접 돌려서 count 값이 대략 N^3/2 근처인지 확인
```

---

## 2. String vs StringBuilder

`s += "a"`를 반복문에서 쓰면 매 반복마다 아래처럼 변환된다.
```java
s = new StringBuilder(s).append("a").toString();
```
리터럴 자체는 String pool 대상이지만, **매 반복마다 달라지는 결과 문자열은
리터럴이 아니라 pool 대상이 아니다.** `toString()`이 매번 호출되면서 현재까지의
문자열 전체를 매번 새 char 배열로 복사 → 1+2+...+N = O(N²).

StringBuilder를 직접 쓰면 반복문 안에서는 `append()`만 반복(내부 배열 재사용,
가끔 두 배 확장만 발생 → amortized O(1)), `toString()`은 마지막에 딱 한 번만
호출 → 전체 O(N).

```java
// 방식 A: String += 반복 (O(N^2)) — 비추천
static String badConcat(int n) {
    String s = "";
    for (int i = 0; i < n; i++) s += "a";
    return s;
}

// 방식 B: StringBuilder.append() 반복 (O(N)) — 정석
static String goodConcat(int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) sb.append("a");
    return sb.toString();
}
```

**실습: 두 방식 성능 직접 비교**
```java
long start = System.nanoTime();
// badConcat(50000) 실행
long end = System.nanoTime();
System.out.println("String 방식: " + (end - start) / 1_000_000 + "ms");

start = System.nanoTime();
// goodConcat(50000) 실행
end = System.nanoTime();
System.out.println("StringBuilder 방식: " + (end - start) / 1_000_000 + "ms");
```

**연습 예제: 문자열 뒤집기**
```java
public String reverse(String s) {
    StringBuilder sb = new StringBuilder();
    // TODO: s를 뒤에서부터 sb에 append
    return sb.toString();
}
// 검증용: new StringBuilder(s).reverse().toString() 과 결과 비교
```

---

## 3. 배열/문자열 자주 쓰는 문법

```java
String s = "hello world";

char c = s.charAt(0);              // 인덱스로 문자 접근
int len = s.length();              // 배열은 arr.length (괄호 없음) 과 구분

String[] words = s.split(" ");     // 공백 기준 분리
// 공백 여러 개 처리: s.split(" +")

int[] arr = {3, 1, 2};
Arrays.sort(arr);                  // int[] → 퀵정렬 계열 (불안정 정렬), 오름차순만

Integer[] boxed = {3, 1, 2};
Arrays.sort(boxed, Collections.reverseOrder());  // 병합정렬 계열 (안정 정렬)

// 배열 → 리스트
List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
// 리스트 → 배열
int[] back = list.stream().mapToInt(Integer::intValue).toArray();

// StringBuilder 자주 쓰는 메서드
StringBuilder sb = new StringBuilder();
sb.append("abc");
sb.reverse();
sb.deleteCharAt(0);
sb.insert(0, "x");
```

**연습 예제: 단어별 첫 글자 대문자로**
```java
public String capitalizeWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String w : words) {
        // TODO: Character.toUpperCase(w.charAt(0))로 첫 글자만 대문자로,
        //       나머지는 그대로 이어붙이기
    }
    return sb.toString().trim();
}
```

---

## 4. 정렬 알고리즘

- **버블 정렬 O(N²)**: 인접한 두 원소를 비교하며 스왑, 한 pass마다 가장 큰 값이
  끝으로 이동. pass가 끝날 때마다 뒤쪽부터 하나씩 정렬 확정.
- **퀵 정렬 평균 O(N log N)**: pivot 기준으로 작은/큰 값을 좌우로 분할한 뒤 재귀.
  `Arrays.sort(int[])`가 이 계열(불안정 정렬).
- **병합 정렬 항상 O(N log N)**: 반으로 계속 쪼갠 뒤 정렬된 두 조각을 합침.
  `Arrays.sort(Integer[])` 등 객체 배열이 이 계열(안정 정렬).

```java
// 버블 정렬 직접 구현
static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

**실습: 버블 정렬을 직접 구현하고 Arrays.sort() 결과와 비교해보기**

---

## 5. 이분탐색 O(log N)

정렬된 배열에서 절반씩 범위를 줄여가며 탐색. 전제조건: 배열이 정렬되어 있어야 함.

```java
static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```
자바에서는 `Arrays.binarySearch(arr, target)`로 이미 구현되어 있음.

**실습: 직접 구현한 binarySearch와 Arrays.binarySearch() 결과 비교해보기**

---

## 6. 입출력 (백준/면접용 — 프로그래머스는 불필요)

프로그래머스는 메서드 시그니처가 주어지고 입출력은 사이트가 처리하므로 아래는
백준(BOJ)이나 면접 질문 대비용으로만 알아두면 됨.

**Scanner가 느린 이유:**
- `nextInt()`는 공백/개행을 건너뛰기 위해 정규식 매칭을 수행하고, 다음 토큰이
  숫자인지 검증하기 위해 또 정규식 매칭을 함 → 정규식 엔진이 반복 호출됨
- 내부 버퍼도 작음(기본 1024)

**BufferedReader가 빠른 이유:**
- `readLine()`은 정규식 없이 개행(`\n`)까지 문자를 그대로 읽어서 반환하는 단순 작업
- 기본 버퍼가 8192(8KB)로 더 큼 → 시스템 콜 빈도 감소
- 숫자 변환은 `Integer.parseInt()`가 담당하는데, 이건 `(c - '0')` 연산으로
  자릿수를 계산하는 단순 반복문 — 정규식 없음

**면접 답변 한 문장:**
> "Scanner는 토큰 구분과 검증에서 정규식 매칭을 반복 수행하고 버퍼도 작아서,
> 입력량이 많아지면 BufferedReader보다 느립니다. BufferedReader는 정규식 없이
> 버퍼에서 문자를 그대로 읽고 파싱은 StringTokenizer/Integer.parseInt로
> 별도 처리하기 때문에 대량 입력에서 유리합니다."

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();  // 출력도 모아뒀다가 한 번에
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
```

---

## 문제풀이 회고
<!-- 집 세션에서 문제 풀고 나서 아래에 추가 -->
