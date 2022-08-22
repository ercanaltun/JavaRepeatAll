package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A14_ArraydeTekrarEdenler {
    public static void main(String[] args) {
        // verilen bir array'deki tekrar eden elementleri yazınız
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 2, 2, 1, 5, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-6, 1, 2, 2, 2, 3, 4, 5, 5, 7, 7, 8, 15]
        List<Integer> liste = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !liste.contains(arr[i])) {
                liste.add(arr[i]);  }
            }
        int [] tekrarEdenler=new int[liste.size()];//yeni array olusturduk

            for (int i = 0; i < tekrarEdenler.length; i++) {
                tekrarEdenler[i]=liste.get(i);

         } System.out.println(Arrays.toString(tekrarEdenler));//[2, 5, 7]

        // Array'e yeni eleman atayamıyoruz.Ancak bir ListArray yardimiyla
        // yeni bir Array olşturarak yeni eleman ları oraya atayabiliriz...




        }

    }

