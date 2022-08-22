package Constructor;

import java.util.ArrayList;
import java.util.List;

public class A01_Magaza_Siparis {

    public static void main(String[] args) {

        A01_Magaza adanaMagazaSiparisi = new A01_Magaza("Adidas", "Üst Grup giysileri",
                "Polo yaka t_shirt", "Beyaz", "s,m,l,xl", 50);
        System.out.println("adanaMagazaSiparisi = " + adanaMagazaSiparisi);


        System.out.println("***************");


        A01_Magaza KutahyaMagazasiSiparisi = new A01_Magaza("Nike", "Takım", "Eşofman",
                "Lacivert", "m,l", 20);
        System.out.println("KutahyaMagazasiSiparis = " + KutahyaMagazasiSiparisi);


        System.out.println("***************");


        A01_Magaza bursamagazasiSiparisi = new A01_Magaza("Hummel", "Sport Equepment", "Tozluk",
                "Mavi", "m", 10);
        System.out.println("bursamagazasiSiparisi = " + bursamagazasiSiparisi);


    }
}
