/*
 * [lv1] 문자열 내림차순으로 배치하기 — https://school.programmers.co.kr/learn/courses/30/lessons/12917
 *
 * 문제 요약: 문자열 s의 문자들을 큰 것부터 작은 순(내림차순)으로 정렬해서 반환.
 *   - 대문자는 소문자보다 작은 것으로 간주 (아스키값 그대로: 'A'=65 < 'a'=97)
 *   - s는 영문 대소문자로만 구성
 *   - 예: "Zbcdefg" → "gfedcbZ"
 * 접근 방식: (풀고 나서 기록)
 * 시간복잡도: (풀고 나서 기록)
 *
 * 힌트: toCharArray() → Arrays.sort()는 오름차순만 되니, 정렬 후 뒤집거나 다른 방법 고민.
 *
 * 실행 방법: java lv1-문자열-내림차순으로-배치하기.java
 */
class DescSort {
    public String solution(String s) {
        // TODO: 여기에 풀이 작성
        return "";
    }

    public static void main(String[] args) {
        DescSort sol = new DescSort();
        System.out.println(sol.solution("Zbcdefg") + " | 기대값: gfedcbZ");
        System.out.println(sol.solution("abcZA") + " | 기대값: cbaZA");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
