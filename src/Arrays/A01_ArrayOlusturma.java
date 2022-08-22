package Arrays;

import java.util.Arrays;

public class A01_ArrayOlusturma {

    public static void main(String[] args) {

        int []arr=new  int[3];//1. yolu : yeni bir Array olusturduk

        arr[0]=5;
        arr[1]=3;
        arr[2]=7;
        //index lere deger assign ettik


        //2.yolu:
        int arr2[]={1,2,4,8,9,6};

        //arr Array'ini yazdirmak icin;
        System.out.println(Arrays.toString(arr));//[5, 3, 7]

        //Array'in eleman larini yzdirmak icin ise fori loop kullanilir==> 5 3 7
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }






    }
}
