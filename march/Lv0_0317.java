package march;

public class Lv0_0317 {
    public int solution(String str1, String str2) {
        int answer = (str1.contains(str2)) ? 1 : 2 ;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Lv0_0317 lv00317 = new Lv0_0317();
        lv00317.solution("ppprrrogrammers", "pppp");
    }
}
