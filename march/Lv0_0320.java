package march;

import static java.lang.Integer.parseInt;

public class Lv0_0320 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] tokens = quiz[i].split(" ");
            int num1 = Integer.parseInt(tokens[0]);
            String a = tokens[1];
            int num2 = Integer.parseInt(tokens[2]);
            int num3 = Integer.parseInt(tokens[4]);
            String result;
            if(a.equals("-")){
                result = String.valueOf(num1 - num2);
            } else {
                result = String.valueOf(num1 + num2);
            }
            System.out.println(result);
            answer[i] = result.equals(String.valueOf(num3)) ? "O" : "X"; // 문자열 비교
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Lv0_0320 lv_0317_2 = new Lv0_0320();
        String [] arr = {"3 - 4 = -3", "5 + 6 = 11"} ;
        lv_0317_2.solution(arr);
    }
}
