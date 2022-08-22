package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A12_ArrayinEnBuyukEnKucukElemanlarininFarki {
    public static void main(String[] args) {

         /*
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
       */

        farkibulmetodu();


    }

    private static void farkibulmetodu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". index icin bir sayi giriniz");
          arr[i]= scan.nextInt();
        }
          Arrays.sort(arr);
            int enBuyuk = arr[arr.length-1];
            int enKucuk = arr[0];

        System.out.println("arr Array'inin en buyuk sayisi olan =  "+enBuyuk+ " ile en kucuk sayisi olan = "
                           +enKucuk+ " sayilarin farki ="+(enBuyuk-enKucuk));

}}