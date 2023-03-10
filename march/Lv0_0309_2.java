// 문제설명 : 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120924

package march;

public class Lv0_0309_2 {
    class Solution {
        public int solution(String A, String B) {
            int result = -1;
            if(A.equals(B)){
                result = 0;
            } else {
                for (int i =1; i<A.length()+1; i++){
                    String newS = A.substring(A.length() - i) + A.substring(0, A.length() - i);
                    if(newS.equals(B)) {
                        result = i;
                        break;
                    }
                }
            }
            return result;
        }
    }
}