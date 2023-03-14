// 문제설명 : 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고
//  알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120911

package march;

import java.util.Arrays;

public class Lv0_0314 {
    public String solution(String my_string) {
        char[] strTochar = my_string.toLowerCase().toCharArray();
        Arrays.sort(strTochar);
        String newString = Arrays.toString(strTochar);
        String result = newString.replaceAll("[, \\[\\]]", "");
        return result;
    }
    public static void main(String[] args) {
        Lv0_0314 lv00314 = new Lv0_0314();
        lv00314.solution("Bcad");
    }
}
