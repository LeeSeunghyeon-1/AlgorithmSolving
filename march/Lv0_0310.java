// 문제설명 : 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120913

package march;

import java.util.ArrayList;
import java.util.List;

public class Lv0_0310 {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        for (int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        if (my_str.length() % n != 0) {
            answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(new String[0]);
    }


    public static void main(String[] args) {
        Lv0_0310 lv00310 = new Lv0_0310();
        lv00310.solution("abcdefghijklmnop",3);
    }
}