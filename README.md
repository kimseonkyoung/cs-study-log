# cs-study-log

자바와 CS 기초를 꾸준히 다지기 위한 개인 학습 기록.
코딩테스트(자바) → CS 이론(OS·네트워크·DB) → 자바 심화·스프링 순으로 확장한다.

## 로드맵

1. **01-coding-test** — 자바 코딩테스트 (강의 섹션 2~11) — 진행 중
2. **02-cs** — 운영체제, 네트워크, 데이터베이스 — 예정
3. **03-java-spring** — 자바 심화 문법, 스프링 — 예정

순서는 번호를 따르되, 주차 데드라인이 아니라 **완료 기준**으로 진행한다 (기간 고정 아님).

## 진행 방식

- 주 4일 가능, 회당 2시간
- 2일: 회사에서 개념 공부 (폐쇄망, 자바 사용 가능) — 강의 시청 위주
- 2일: 집에서 프로그래머스 문제풀이
- 개념정리(`notes.md`)와 문제풀이(`solutions/`)를 분리해서 관리
- 강의 분량이 회사 2시간을 넘는 섹션은 집에서 잠깐 이어보고 문제풀이로 전환하거나 다음 세션에 이어감

섹션 순서는 [`01-coding-test/curriculum.md`](01-coding-test/curriculum.md) 참고.

## IDE 설정 (IntelliJ, 기기마다 1회)

- Sources Root는 `03-java-spring/java` **하나만** 지정한다 (우클릭 → Mark Directory as → Sources Root).
- 레포 루트가 Sources Root로 잡혀 있으면 `01-coding-test` 하위 파일에서
  "invalid package name" 에러가 뜬다 — 루트는 Unmark 할 것.
- `01-coding-test`의 풀이 파일은 터미널에서 `java 파일명.java`로 실행한다 (단일 파일 실행).

## 구조

```
cs-study-log/
├── PROMPT.md                          ← 세션 정리용 재사용 프롬프트
├── 01-coding-test/                    ← 자바 코딩테스트 트랙
│   ├── curriculum.md                  ← 섹션 순서 & 분량
│   ├── review-checkpoints.md          ← 섹션 2개마다 하는 복습 체크포인트 로그
│   ├── templates/                     ← 풀이 파일 템플릿
│   ├── practice/                      ← 템플릿 암기 연습장 (연습 코드는 커밋 안 됨)
│   ├── 00-intro/                      ← 시간복잡도, StringBuilder 등 기초
│   └── 02-string/ ~ 11-dp/            ← 강의 섹션별 폴더
│       (각 폴더: notes.md 강의체크리스트+개념정리, solutions/ 문제풀이)
├── 02-cs/                             ← CS 이론 트랙
│   ├── os/
│   ├── network/
│   └── database/
└── 03-java-spring/                    ← 자바 심화·스프링 트랙
    ├── java/
    └── spring/
```
