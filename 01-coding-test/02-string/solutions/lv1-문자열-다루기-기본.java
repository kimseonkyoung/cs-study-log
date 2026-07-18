/*
 * [lv1] 문자열 다루기 기본 — https://school.programmers.co.kr/learn/courses/30/lessons/12918
 *
 * 문제 요약: 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성돼 있으면 true, 아니면 false.
 *   - s는 길이 1 이상 8 이하인 문자열
 *   - 예: "a234" → false (숫자 아님), "1234" → true
 * 접근 방식: (풀고 나서 기록)
 * 시간복잡도: (풀고 나서 기록)
 *
 * 힌트: 길이 체크 먼저 → 문자 하나씩 Character.isDigit() 또는 '0'~'9' 범위 비교
 *
 * 실행 방법: java lv1-문자열-다루기-기본.java
 */
class StringBasic {
    public boolean solution(String s) {
        // TODO: 여기에 풀이 작성
        return false;
    }

    public static void main(String[] args) {
        StringBasic sol = new StringBasic();
        System.out.println(sol.solution("1234") + " | 기대값: true");
        System.out.println(sol.solution("a234") + " | 기대값: false");
        System.out.println(sol.solution("123456") + " | 기대값: true");
        System.out.println(sol.solution("12345") + " | 기대값: false (길이 5)");
        System.out.println(sol.solution("12a4") + " | 기대값: false");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
