/*
 * [인트로 연습 2] 단어별 첫 글자 대문자로 — notes.md "3. 배열/문자열 자주 쓰는 문법" 연습
 *
 * 문제: 공백으로 구분된 문장 s에서 각 단어의 첫 글자만 대문자로 바꿔 반환하라.
 *       나머지 글자는 그대로 둔다.
 * 힌트: split(" "), Character.toUpperCase(), substring(), StringBuilder
 *
 * 접근 방식: (풀고 나서 채우기)
 * 시간복잡도: (풀고 나서 채우기)
 *
 * 실행 방법: java intro-02-단어별첫글자대문자.java
 */
class Solution {
    public String capitalizeWords(String s) {
        // TODO: 여기에 풀이 작성
        return "";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.capitalizeWords("hello world") + " | 기대값: Hello World");
        System.out.println(sol.capitalizeWords("java IS fun") + " | 기대값: Java IS Fun");
        System.out.println(sol.capitalizeWords("a b c") + " | 기대값: A B C");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
