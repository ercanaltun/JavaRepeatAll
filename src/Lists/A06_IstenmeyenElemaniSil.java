package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A06_IstenmeyenElemaniSil {
    public static void main(String[] args) {

        // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler = {"Adana", "Bursa", "Mardin", "Ankara", "Kütahya", "Izmir"};
        String istenmeyenHarf = "n";
        List<String> kalanlar = new ArrayList<>();

        for (String each : sehirler
        ) {
            if (!each.contains("n")) {
                kalanlar.add(each);
            }

        }
        System.out.println("kalanlar = " + kalanlar);//kalanlar = [Bursa, Kütahya, Izmir]

        String[] sehirler2 = new String[kalanlar.size()];


        for (int i = 0; i < sehirler2.length; i++) {
            sehirler2[i] = kalanlar.get(i);
        }
        System.out.println(Arrays.toString(sehirler2));//[Bursa, Kütahya, Izmir]


    }
}
