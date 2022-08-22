package Arrays;

import java.util.ArrayList;
import java.util.List;

public class A16_SpecialCharRemoveArrayList {
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
        String[] arr = {"$-130", "$15", "$20"};


        System.out.println(getsum(arr));

    }

    private static int getsum(String[] arr) {
              int toplam=0;
        for (String each :arr
             ) {Integer para =Integer.parseInt(each.replace("$",""));
               toplam+=para;

        }
        if (toplam>=0){
            return toplam;
        }else{
            return -1;
        }

    }


}
