/*
 * [lv1] 서울에서 김서방 찾기 — https://school.programmers.co.kr/learn/courses/30/lessons/12919
 *
 * 문제 요약: String 배열 seoul에서 "Kim"이 있는 인덱스 x를 찾아
 *   "김서방은 x에 있다" 형태의 문자열을 반환한다.
 *   - seoul에 "Kim"은 반드시 하나만 있음
 *   - 예: {"Jane", "Kim"} → "김서방은 1에 있다"
 * 접근 방식: (풀고 나서 기록)
 * 시간복잡도: (풀고 나서 기록)
 *
 * 힌트: 반복문으로 equals 비교. 문자열 비교에 == 쓰면 안 되는 이유도 같이 정리해보기.
 *
 * 실행 방법: java lv1-서울에서-김서방-찾기.java
 */
class Solution {
    public String solution(String[] seoul) {
        // TODO: 여기에 풀이 작성
        return "";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String[]{"Jane", "Kim"}) + " | 기대값: 김서방은 1에 있다");
        System.out.println(sol.solution(new String[]{"Kim", "Jane", "Tom"}) + " | 기대값: 김서방은 0에 있다");
        System.out.println(sol.solution(new String[]{"Queen", "Tod", "Kim"}) + " | 기대값: 김서방은 2에 있다");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
