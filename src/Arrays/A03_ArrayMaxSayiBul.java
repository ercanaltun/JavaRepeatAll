package Arrays;

import java.util.Arrays;

public class A03_ArrayMaxSayiBul {
    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’deki
        // en buyuk sayiyi yazdiran bir method olusturun.
        //2 sekilde yapabiliriz.1. fori ile;

        int sayilar[]={3,5,7,1,4,9,5,2};
        int maxSayi=sayilar[0];

        for (int i = 0; i <sayilar.length; i++) {

            if (maxSayi<sayilar[i]){
                maxSayi=sayilar[i];
            }
        }
        System.out.println("maxSayi = " + maxSayi);//maxSayi = 9


        //2.yöntem ise basit :sort methodu ile sıraladıgımızda son index en buyuk sayıdır;
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        maxSayi=sayilar[sayilar.length-1];

















    }
}
