package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A01_ListOlusturmaElemanEkleme {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        String ad1="Ahmet";
        String ad2 ="Mehmet";
        String ad3="Samet";
        String ad4="Hikmet";

        isimler.add(ad1);
        isimler.add(ad2);
        isimler.add(ad3);
        isimler.add(ad4);
        System.out.println("isimler = " + isimler);//isimler = [Ahmet, Mehmet, Samet, Hikmet]

        Collections.sort(isimler);
        System.out.println("isimler = " + isimler); //isimler = [Ahmet, Hikmet, Mehmet, Samet]

        isimler.remove("Samet");
        System.out.println("isimler = " + isimler); //[Ahmet, Mehmet, Hikmet]

        isimler.set(0,"Salih");
        System.out.println("isimler = " + isimler); // [Salih, Mehmet, Hikmet]

        isimler.clear();
        System.out.println("isimler = " + isimler);// isimler = []



































    }
}
