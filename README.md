# cs-study-log

자바와 CS 기초를 꾸준히 다지기 위한 개인 학습 기록.
코딩테스트(자바)부터 시작해서 한 바퀴 돌린 뒤 OS, 네트워크 순으로 확장한다.

## 로드맵

1. **자바 코딩테스트 (강의 섹션 2~11)** — 진행 중, 섹션 완료 기준으로 진행 (기간 고정 아님)
2. **운영체제 (OS)** — 예정
3. **네트워크** — 예정

## 진행 방식

- 주 4일 가능, 회당 2시간
- 2일: 회사에서 개념 공부 (폐쇄망, 자바 사용 가능) — 강의 시청 위주
- 2일: 집에서 프로그래머스 문제풀이
- 개념정리(`notes.md`)와 문제풀이(`solutions/`)를 분리해서 관리
- **주차 데드라인이 아니라 섹션 완료 기준으로 진행**: 강의 듣고 → 개념정리 → 문제풀이로 익숙해지면 다음 섹션
- 강의 분량이 회사 2시간을 넘는 섹션은 집에서 잠깐 이어보고 문제풀이로 전환하거나 다음 세션에 이어감

자세한 섹션 순서는 [`01-java-coding-test/curriculum.md`](01-java-coding-test/curriculum.md),
주차별 예상 일정은 [`01-java-coding-test/schedule.md`](01-java-coding-test/schedule.md) 참고.

## 구조

```
cs-study-log/
├── PROMPT.md                          ← 세션 정리용 재사용 프롬프트
└── 01-java-coding-test/
    ├── curriculum.md                  ← 전체 일정 & 강의-주차 매핑
    ├── review-checkpoints.md          ← 섹션 2개마다 하는 복습 체크포인트 로그
    ├── 00-intro/                      ← 시간복잡도, StringBuilder 등 기초 (완료)
    ├── 02-string/
    ├── 03-array/
    ├── 04-two-pointers-sliding-window/
    ├── 05-hashmap-treeset/
    ├── 06-stack-queue/
    ├── 07-sorting-searching/
    ├── 08-recursive-tree-graph/
    ├── 09-dfs-bfs-application/
    ├── 10-greedy/
    └── 11-dp/
        (각 폴더: notes.md 강의체크리스트+개념정리, solutions/ 문제풀이)
```
