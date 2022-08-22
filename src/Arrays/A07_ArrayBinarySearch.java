package Arrays;

import java.util.Arrays;

public class A07_ArrayBinarySearch {
    public static void main(String[] args) {
        /*
        Binary search, java eleman aramanin enkisa yoludur.
        ama oncesinde sort yaparak elemanları  siralamak gerekir
         */
        String isimler[] = {"Ahmet", "Salih", "Selim", "Nuri", "Demir", "Ercan"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        //[Ahmet, Demir, Ercan, Nuri, Salih, Selim]==>alfabetik siraladi
        String arananIsim="Kübra";
        System.out.println("Arrays.binarySearch(isimler,arananIsim) = "
                + Arrays.binarySearch(isimler, arananIsim));
             //olsaydı  E'den sonra N'den once gelecegi icin sirasini verdi==> -4

        String arananIsim2="Ercan";
        System.out.println(Arrays.binarySearch(isimler,arananIsim2));
        //"Ercan var.index=2/ var olunca index'i verir.olmayinca ise sirasini verir (-) li olarak


    }
}
