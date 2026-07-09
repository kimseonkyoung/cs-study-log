/*
 * [lv1] 문자열 다루기 기본 — https://school.programmers.co.kr/learn/courses/30/lessons/12918
 *
 * 문제 요약: 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성돼 있으면 true, 아니면 false
 * 접근 방식: (풀고 나서 채우기)
 * 시간복잡도: (풀고 나서 채우기)
 *
 * 실행 방법: java lv1-문자열-다루기-기본.java
 */
class Solution {
    public boolean solution(String s) {
        // TODO: 여기에 풀이 작성
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // 로컬 테스트 케이스
        System.out.println(sol.solution("a234") + " | 기대값: false");
        System.out.println(sol.solution("1234") + " | 기대값: true");
        System.out.println(sol.solution("123456") + " | 기대값: true");
        System.out.println(sol.solution("12345") + " | 기대값: false (길이 5)");
        System.out.println(sol.solution("12 34") + " | 기대값: false (공백 포함)");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
