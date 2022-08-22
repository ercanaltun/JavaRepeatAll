package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A15_ArrayTekrarEdenleriVeDigerleriniBirKezYazdir {
    public static void main(String[] args) {

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */

        int sayi[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        Arrays.sort(sayi);

        List<Integer>tekrarsizlar=new ArrayList<>();


        for (int i = 0; i < sayi.length-1; i++) {
            if (sayi[i]==sayi[i+1] && ! tekrarsizlar.contains(sayi[i])){
                tekrarsizlar.add(sayi[i] );
            }
        }
        for (int i = 0; i < sayi.length; i++) {
            if (!tekrarsizlar.contains(sayi[i])){
                tekrarsizlar.add(sayi[i]);
            }
        }
        System.out.println("tekrarEdenler = " + tekrarsizlar);
        //tekrarEdenler = [-2, 1, 2, 3, 5, 6, 4, 7, 8, 9, 10]

        }

        }




