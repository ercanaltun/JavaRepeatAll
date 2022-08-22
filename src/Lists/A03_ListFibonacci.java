package Lists;

import java.util.ArrayList;
import java.util.List;

public class A03_ListFibonacci {
    public static void main(String[] args) {
        //Verilen bir sayiya kadar tum fibonacci sayilarini
        // bir liste olarak olusturup yazdirin

        List<Integer> liste = new ArrayList<>();
        int sayi=15;
        int ilkSayi=0;
        int ikiniciSayi=1;
        int ucuncuSayi=0;
        for (int i = 0; i < 15; i++) {
            System.out.print(ilkSayi+" ");
            liste.add(ilkSayi);
             ucuncuSayi=ilkSayi+ikiniciSayi;
             ilkSayi=ikiniciSayi;
             ikiniciSayi=ucuncuSayi;

        }
        System.out.println();
        System.out.println("liste = " + liste);
        //liste = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]


    }
}
