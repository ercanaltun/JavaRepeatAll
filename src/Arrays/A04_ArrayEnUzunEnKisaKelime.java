package Arrays;

public class A04_ArrayEnUzunEnKisaKelime {
    public static void main(String[] args) {

        //Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican" };
        String enKisa=isimler[0];
        String enUzun="";

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length()>enUzun.length()&& !enUzun.contains(isimler[i])){
                enUzun=isimler[i];
            }
        }
        System.out.println("enUzun = " + enUzun);  //enUzun = Hayrullah

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()<enKisa.length() && !enKisa.contains(isimler[i])){
                enKisa=isimler[i];
            }

        }
        System.out.println("enKisa = " + enKisa);//enKisa = Onur

        /*
        Burada ki Array 'imiz bir String.en uzun ve en kısa dediği için kelimelerin
        length'ine bakarak bulabiliriz. fori içinde bu [i] ile iafede ediliyor..
         */












    }
}
