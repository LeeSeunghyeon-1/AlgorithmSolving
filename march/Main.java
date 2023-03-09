package march;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> permutation (String[] arr, int dep, int r) {
        List<String> solutionList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(dep == r) {
            for (int i = 0; i < r; i ++) {
                sb.append(arr[i]);
            }
            solutionList.add(String.valueOf(sb));
            System.out.println(solutionList);
            return solutionList;
        }
        for(int i = dep; i<arr.length; i++) {
            swap(arr, dep, i);
            permutation(arr, dep + 1, r);
            swap(arr, dep, i);
        }
        return solutionList;
    }
    public static void swap (String[] arr, int dep, int i){
        String tmp = arr[dep];
        arr[dep] = arr[i];
        arr[i] = tmp;
    }

    public static void main(String[] args) {
        String [] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String [] arr = {"aya","ye","woo", "ma"};
        List<String> a2 = new ArrayList<>();
        for (int i = 1; i < arr.length +1; i ++){
            a2 = permutation(arr, 0, i);
        }
        int cnt = 0;
        for(int i =0; i < babbling.length; i++) {
            for(int j =0; j <a2.size(); j++){
                if(a2.equals(babbling[i])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
