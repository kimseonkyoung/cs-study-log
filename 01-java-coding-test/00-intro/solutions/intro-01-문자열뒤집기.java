/*
 * [인트로 연습 1] 문자열 뒤집기 — notes.md "2. String vs StringBuilder" 연습
 *
 * 문제: 문자열 s를 뒤집어서 반환하라.
 *       단, StringBuilder의 reverse()는 쓰지 말 것 (직접 뒤에서부터 append).
 * 조건: 반복문에서 String += 를 쓰면 안 됨 (O(N^2)가 되는 이유를 설명할 수 있어야 함)
 *
 * 접근 방식: (풀고 나서 채우기)
 * 시간복잡도: (풀고 나서 채우기)
 *
 * 실행 방법: java intro-01-문자열뒤집기.java
 */
class Solution {
    public String reverse(String s) {
        // TODO: 여기에 풀이 작성 (sb.reverse() 금지)
        return "";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse("hello") + " | 기대값: olleh");
        System.out.println(sol.reverse("a") + " | 기대값: a");
        System.out.println(sol.reverse("") + " | 기대값: (빈 문자열)");
        System.out.println(sol.reverse("ab cd") + " | 기대값: dc ba");
        // 검증: new StringBuilder(s).reverse().toString() 과 결과가 같아야 함
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
