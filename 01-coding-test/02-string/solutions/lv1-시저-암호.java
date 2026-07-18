/*
 * [lv1] 시저 암호 — https://school.programmers.co.kr/learn/courses/30/lessons/12926
 *
 * 문제 요약: 문자열 s의 각 알파벳을 n만큼 뒤의 알파벳으로 민 문자열을 반환.
 *   - 'z'/'Z'를 넘어가면 처음('a'/'A')으로 순환
 *   - 대문자는 대문자로, 소문자는 소문자로 유지
 *   - 공백은 밀지 않고 그대로 둠
 *   - 1 <= n <= 25, s는 알파벳과 공백으로만 구성
 *   - 예: "AB", 1 → "BC" / "z", 1 → "a" / "a B z", 4 → "e F d"
 * 접근 방식: (풀고 나서 기록)
 * 시간복잡도: (풀고 나서 기록)
 *
 * 힌트(함정 포인트): 대소문자 각각 기준점('a'/'A')에서의 거리로 계산 후 % 26.
 *   char에 바로 +n 하면 'z' 넘어갈 때 알파벳이 아닌 문자가 된다.
 *
 * 실행 방법: java lv1-시저-암호.java
 */
class CaesarCipher {
    public String solution(String s, int n) {
        // TODO: 여기에 풀이 작성
        return "";
    }

    public static void main(String[] args) {
        CaesarCipher sol = new CaesarCipher();
        System.out.println(sol.solution("AB", 1) + " | 기대값: BC");
        System.out.println(sol.solution("z", 1) + " | 기대값: a");
        System.out.println(sol.solution("a B z", 4) + " | 기대값: e F d");
        System.out.println(sol.solution("ZebrA", 3) + " | 기대값: CheuD (Z 순환 확인)");
    }
}

/*
 * ── 막혔던 부분 / 실수 ──
 * (풀고 나서 기록)
 */
