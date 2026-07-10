/*
 * [인트로 연습 3] 버블 정렬 직접 구현 — notes.md "4. 정렬 알고리즘" 연습
 *
 * 문제: int 배열을 버블 정렬로 오름차순 정렬하라 (Arrays.sort() 사용 금지).
 *       한 pass가 끝날 때마다 가장 큰 값이 뒤로 확정되는 구조여야 한다.
 * 보너스: 한 pass에서 스왑이 한 번도 없으면 조기 종료하는 최적화도 넣어보기 → 완료
 *
 * 접근 방식: 인접한 arr[j], arr[j+1]을 비교해 큰 값을 뒤로 스왑.
 *            pass마다 뒤쪽부터 자리가 확정되므로 안쪽 루프는 n-1-i까지만.
 *            pass 안에서 스왑이 0번이면(swap == false) 이미 정렬 완료 → break.
 * 시간복잡도: 최악/평균 O(N^2), 이미 정렬된 입력은 조기 종료로 O(N)
 *
 * 실행 방법: java intro-03-버블정렬.java
 */
import java.util.Arrays;

class Solution {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
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
 * ── 막혔던 부분 / 실수 (2026-07-10, 3트에 통과) ──
 * 1트: 안쪽 for 조건을 j > n-1-i 로 씀 (부등호 반대) → 루프가 한 번도 안 돌아서
 *      배열이 들어온 그대로 나옴. for 조건은 "참인 동안 돈다"를 다시 새김.
 * 1트: swap 선언을 바깥 루프 밖에 둠 → pass마다 리셋이 안 돼서 조기 종료 무력화.
 * 2트: swap = true 를 if 블록 밖에 둠 → 비교만 해도 "스왑했다"가 되어
 *      정렬된 {1,2,3,4,5}에서 pass 5번 돎 (기대 1번). if 안으로 옮겨서 해결.
 * 교훈: swap 플래그는 ①pass 시작마다 false 초기화 ②실제 스왑한 자리에서만 true
 *       ③pass 끝나고 검사 — 위치 3개가 전부 정해져 있다.
 */
