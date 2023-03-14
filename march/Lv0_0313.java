// 문제설명 : 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120912

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
