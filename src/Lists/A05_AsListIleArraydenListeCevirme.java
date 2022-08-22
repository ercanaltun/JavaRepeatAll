package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A05_AsListIleArraydenListeCevirme {
    public static void main(String[] args) {



        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz
           Ancak bu method'un 2 tane kotu yan etkisi var
           - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
             bu sekilde olusturulan list'lerde kullanilamaz
           - kaynak olan array ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */
        String[] arr={"Ismail","Nurullah","Fatih"};//list = [Ismail, Nurullah, Fatih]

        List<String>list=new ArrayList<>();
        list= Arrays.asList(arr);
        System.out.println("list = " + list);



    }
}
