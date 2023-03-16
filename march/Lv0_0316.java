package march;

import java.awt.geom.RoundRectangle2D;

public class Lv0_0316 {

    public int solution(int n) {
        int r = (int) Math.sqrt(n);
        r = (r*r==n) ? 1 : 2;
        System.out.println(r);
        return r;
    }

    public static void main(String[] args) {
        Lv0_0316 lv00316 = new Lv0_0316();
        lv00316.solution(976);

    }
}
