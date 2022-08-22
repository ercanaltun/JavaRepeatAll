package Arrays;

import java.util.Arrays;

public class A08_ArraySplit {
    public static void main(String[] args) {

        String str="hayat bunu neden yapiyorsun";
        String[] kelimeler=str.split("");//harflere ayirir
        System.out.println(Arrays.toString(kelimeler));
        //[h, a, y, a, t,  , b, u, n, u,  , n, e, d, e, n,  , y, a, p, i, y, o, r, s, u, n]

         kelimeler=str.split("a");
        System.out.println(Arrays.toString(kelimeler));
        //[h, y, t bunu neden y, piyorsun]==>'a'lardan böler'a' yerine ,virgül koyar

    }

}
