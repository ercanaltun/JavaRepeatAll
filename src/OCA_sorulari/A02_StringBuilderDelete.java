package OCA_sorulari;

public class A02_StringBuilderDelete {
    public static void main(String[] args) {
        // Which statement will empty the contents of a StringBuider varibale named sb?

        StringBuilder sb=new StringBuilder("dünya");
        System.out.println("sb = " + sb);//sb = dünya

         // A.sb.deleteAll();==>deleteAll metodu yok
         // B. sb.delete(0,sb.size());==> size Metodo da yok
         // C. sb.removeAll();==> removeAll Metodo da yok

          sb.delete(0,sb.length());
        System.out.println("sb = " + sb);//sb =



    }
}
