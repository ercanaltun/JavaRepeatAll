package Arrays;

import java.util.Arrays;

public class A02_ArraySolaKaydirma {

    public static void main(String[] args) {
        // Soru 1: Verilen 3 elemanli bir array’in
        // tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int[] array ={1,2,3};
        int gecici=array[0];

        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
            System.out.println(Arrays.toString(array));//[2, 3, 3]
        }
         array[2]=gecici;
        System.out.println(Arrays.toString(array));//[2, 3, 1]

         //simdi de saga dalalı yazdiralim

        gecici=array[array.length-1];

        for (int i = array.length-1; i>0 ; i--) {
            array[i]=array[i-1];

        }array[0]=gecici;
        System.out.println(Arrays.toString(array));//[1, 2, 3]




    }
}
