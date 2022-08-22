package Arrays;

import java.util.Scanner;

public class A05_ArrayContainsMi {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldiginiz bir ismin verilen array’de olup olmadigini
        // kontrol edip
        // bize true veya false sonucu donen bir method olusturun.

        String isimler[] = {"Ahmet", "Salih", "Selim", "Nuri", "Demir", "Ercan"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String girilenIsim = scan.nextLine();
        boolean sonuc = contains(isimler, girilenIsim);
        if (sonuc){
            System.out.println("Girilen isim lstede var");
        }else{
            System.out.println("Girilen isim lstede yok");

        }
    }
    public static boolean contains(String[] isimler, String girilenIsim) {

        boolean sonucMethod = false;

        for (int i = 0; i < isimler.length; i++) {
            if (girilenIsim.equalsIgnoreCase(isimler[i])) {
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }
}