package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEnUzunkelimeyiReturnEdenMethod {

    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("cumle girin = ");
        String cumle=scan.nextLine();

        System.out.println("enUzunKelimeyiBulBakalim(cumle) = " + enUzunKelimeyiBulBakalim(cumle));


    }

    public static String enUzunKelimeyiBulBakalim(String cumle) {

        String arr[]=cumle.split(" ");
        int maxUzunluk=0;
        String enUzunKelime="";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>maxUzunluk){
                maxUzunluk=arr[i].length();
                enUzunKelime=arr[i];
            }

        }




        return  enUzunKelime;

    }


}