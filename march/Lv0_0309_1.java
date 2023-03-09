// 문제설명 : 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120922

package march;

public class Lv0_0309_1 {
    public int solution(int M, int N) {
        return M * N - 1;
    }
}
