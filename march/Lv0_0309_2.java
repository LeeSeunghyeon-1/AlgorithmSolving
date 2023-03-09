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