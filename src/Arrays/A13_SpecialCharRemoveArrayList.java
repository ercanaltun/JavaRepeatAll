package Arrays;

import java.util.ArrayList;
import java.util.List;

public class A13_SpecialCharRemoveArrayList {
    public static void main(String[] args) {
                      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
        List<String> liste = new ArrayList<>();
        liste.add("$13");
        liste.add("$15");
        liste.add("$20");
        System.out.println( getSum(liste));

    }
    private static int getSum(List<String> liste) {
        int toplam = 0;
        for (String each : liste
        ) {
            Integer dolarsiz = Integer.parseInt(each.replace("$", ""));
            toplam += dolarsiz;
        }
        if (toplam > 0) {
            return toplam;

        } else {
            return -1;

        }
    }
}
