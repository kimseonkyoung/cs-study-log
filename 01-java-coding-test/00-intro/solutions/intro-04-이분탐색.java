/*
 * [인트로 연습 4] 이분탐색 직접 구현 — notes.md "5. 이분탐색" 연습
 *
 * 문제: 오름차순 정렬된 int 배열에서 target의 인덱스를 반환하라. 없으면 -1.
 *       (Arrays.binarySearch() 사용 금지 — while 루프로 직접 구현)
 * 주의: left <= right 조건, mid 갱신 시 +1/-1 빼먹지 않기
 *
 * 접근 방식: (풀고 나서 채우기)
 * 시간복잡도: (풀고 나서 채우기)
 *
 * 실행 방법: java intro-04-이분탐색.java
 */
class Solution {
    public int binarySearch(int[] arr, int target) {
        // TODO: 여기에 풀이 작성
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 3, 5, 7, 9, 11};

        System.out.println(sol.binarySearch(arr, 7) + " | 기대값: 3");
        System.out.println(sol.binarySearch(arr, 1) + " | 기대값: 0 (맨 앞)");
        System.out.println(sol.binarySearch(arr, 11) + " | 기대값: 5 (맨 뒤)");
        System.out.println(sol.binarySearch(arr, 4) + " | 기대값: -1 (없는 값)");
        System.out.println(sol.binarySearch(new int[]{}, 5) + " | 기대값: -1 (빈 배열)");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
