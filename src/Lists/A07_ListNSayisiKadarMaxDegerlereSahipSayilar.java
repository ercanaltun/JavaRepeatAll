package Lists;

import java.util.ArrayList;
import java.util.List;

public class A07_ListNSayisiKadarMaxDegerlereSahipSayilar {

    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
         int [] input={1,2,3,4,5,6,7,8};
        List<Integer> list=new ArrayList<>();
        List<Integer> maxler=new ArrayList<>();


        for (int each :input
             ) { list.add(each);
        }

        int nsayi=3;
        int sayac=1;


        while (nsayi>=sayac){
            int max= list.get(0);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max && (!maxler.contains(list.get(i)))){
                    max= list.get(i);

                }
            }
            maxler.add(max);
            sayac++;
        }


        System.out.println("maxler = " + maxler);
    }
}
