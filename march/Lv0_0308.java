// 문제설명 : 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
//          연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120923

package march;

public class Lv0_0308 {
    public int[] solution(int num, int total) {

        int[] answer = new int [num];
        int addNum = 0;

        for(int i =0; i<num; i++){
            addNum += i;
        }

        for(int i =0; i<answer.length; i++){
            answer[i] = (total - addNum)/num + i;
        }
        return answer;
    }
//실행용
    public static void main(String[] args) {
        Lv0_0308 lv00308 = new Lv0_0308();
        lv00308.solution(3,12);
    }
}
