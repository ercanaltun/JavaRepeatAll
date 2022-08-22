package Arrays;

import java.util.Arrays;

public class A06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        //Array'lere normalde eleman eklenemez.yeni bir eleman eklemek istersek;
        // yeni array Array olusturmamiz gerekir

        String isimler[] = {"Ahmet", "Salih", "Selim", "Nuri", "Demir", "Ercan"};
        String eklenecekIsim="Memduh";
        String[]ekliListe=new  String[isimler.length+1];

        for (int i = 0; i < isimler.length; i++) {
            ekliListe[i]=isimler[i];

        }
        System.out.println(Arrays.toString(ekliListe));
        //[Ahmet, Salih, Selim, Nuri, Demir, Ercan, null]


        ekliListe[ekliListe.length-1]=eklenecekIsim;
        System.out.println(Arrays.toString(ekliListe));
        //[Ahmet, Salih, Selim, Nuri, Demir, Ercan, Memduh]



    }
}
