/*
 * [인트로 연습 3] 버블 정렬 직접 구현 — notes.md "4. 정렬 알고리즘" 연습
 *
 * 문제: int 배열을 버블 정렬로 오름차순 정렬하라 (Arrays.sort() 사용 금지).
 *       한 pass가 끝날 때마다 가장 큰 값이 뒤로 확정되는 구조여야 한다.
 * 보너스: 한 pass에서 스왑이 한 번도 없으면 조기 종료하는 최적화도 넣어보기
 *
 * 접근 방식: (풀고 나서 채우기)
 * 시간복잡도: (풀고 나서 채우기)
 *
 * 실행 방법: java intro-03-버블정렬.java
 */
import java.util.Arrays;

class Solution {
    public void bubbleSort(int[] arr) {
        // TODO: 여기에 풀이 작성 (제자리 정렬)
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] a = {5, 3, 8, 1, 2};
        sol.bubbleSort(a);
        System.out.println(Arrays.toString(a) + " | 기대값: [1, 2, 3, 5, 8]");

        int[] b = {1};
        sol.bubbleSort(b);
        System.out.println(Arrays.toString(b) + " | 기대값: [1]");

        int[] c = {2, 2, 1, 1};
        sol.bubbleSort(c);
        System.out.println(Arrays.toString(c) + " | 기대값: [1, 1, 2, 2]");

        // 검증: Arrays.sort() 결과와 같아야 함
        int[] d = {9, -1, 0, 7, 3, 3};
        int[] expected = d.clone();
        Arrays.sort(expected);
        sol.bubbleSort(d);
        System.out.println(Arrays.equals(d, expected) + " | 기대값: true");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
