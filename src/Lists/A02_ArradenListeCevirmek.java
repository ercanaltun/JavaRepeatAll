package Lists;

import java.util.ArrayList;
import java.util.List;

public class A02_ArradenListeCevirmek {

    public static void main(String[] args) {
        //array deki tek sayilari ArrayListe ekle
        int[] sayilar = {1, 5, 9, 23, 45, 62, 78, 12, 56, 32};
        List<Integer> liste = new ArrayList<>();

        for (int each : sayilar
        ) {
            if (each % 2 == 1) {
                liste.add(each);
            }

        }
        System.out.println("liste = " + liste); //liste = [1, 5, 9, 23, 45]
    }
}
