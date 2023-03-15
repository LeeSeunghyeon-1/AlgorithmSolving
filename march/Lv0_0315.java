package march;

public class Lv0_0315 {

    public int solution(int n, int t) {
        int answer = n;
        for(int i = 1; i<t+1; i++){
            answer *= 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv0_0315 lv00315 = new Lv0_0315();
        lv00315.solution(2,3);
    }
}
