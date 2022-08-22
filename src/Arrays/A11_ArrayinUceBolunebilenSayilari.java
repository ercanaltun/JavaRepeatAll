package Arrays;

import java.util.Scanner;

public class A11_ArrayinUceBolunebilenSayilari {

    public static void main(String[] args) {
                /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int arr[] = new int[8];
        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " .index'teki sayiyi giriniz");
            int girilenSayi = scan.nextInt();
            if (girilenSayi % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("3 'e bolunebilen sayi : " + sayac);

    }
}
