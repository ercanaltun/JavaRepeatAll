package Constructor;

public class A01_Magaza {


    String marka = "Marka Belirtilmedi";
    String alt_ustGrup = "Belirtilmedi";
    String turu = "Giyim Turu Belirtilmedi";
    String renk = "Belirtilmedi";
    String beden = "Belirtilmedi";

    int adet;

    @Override
    public String toString() {
        return
                        "\nmarka       = " + marka +
                        "\nalt_ustGrup = " + alt_ustGrup +
                        "\nturu        = " + turu +
                        "\nrenk        = " + renk +
                        "\nbeden       = " + beden +
                        "\nadet        = " + adet;

    }

    public A01_Magaza() {
    }

    public A01_Magaza(String marka, String alt_ustGrup, String turu,
                      String renk, String beden, int adet) {
        this.marka = marka;
        this.alt_ustGrup = alt_ustGrup;
        this.turu = turu;
        this.renk = renk;
        this.beden = beden;
        this.adet = adet
        ;


    }
}
