package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A04_ListRandom {

    public static void main(String[] args) {
        /*
        icinde 20 tane 100'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */

      List<Integer>sayiList=new ArrayList<>();
      int sayi=0;
      Random rnd=new Random();
      Scanner scan=new Scanner(System.in);
      while (sayiList.size()<20){
          sayi=rnd.nextInt(100);
          if (!sayiList.contains(sayi))
          sayiList.add(sayi);
      }System.out.print(sayiList+ " ");

        System.out.println();

         int adet=1;
         boolean bildiMi=true;
         while (bildiMi) {
             System.out.println("tahmin için sayi giriniz");
             int tahmin=scan.nextInt();
             if (sayiList.contains(tahmin)) {
                 System.out.println("Bravo! " + adet + ". tahminde bildiniz ");
                   bildiMi=false;
             } else {
                 System.out.println(adet + ". tahminde de bilemediniz.Yaziklar olsun :( ");
                 adet++;
             }
         }



    }
}
