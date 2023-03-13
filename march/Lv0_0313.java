package march;

public class Lv0_0313 {
    public int solution(int[] array) {
        int answer = 0;
        System.out.println(array);
        for (int i =0; i<array.length; i++){
            String a = String.valueOf(array[i]);
            for (int j = 0; j<a.length(); j++){
                if (a.charAt(j) == '7'){
                    answer ++;
                }
            }
        }

        System.out.println(answer);
            return answer;
    }

    public static void main(String[] args) {
        int[] arr = {123, 456, 777};
        Lv0_0313 lv00313 = new Lv0_0313();
        lv00313.solution(arr);
    }
}
