import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        byte küçükVeri = 122;
        short küçükVeri2 = 13444;
        int yas = 268888888;
        long büyükVeri = 1555555555;
        float virgüllüSayı = 15.6f;
        double virgüllüSayı2 = 15.4;
        char karakter = 'a';
        boolean isimDogrumu = false;


        System.out.println(küçükVeri);
        System.out.println(küçükVeri2);
        System.out.println(yas);
        System.out.println(büyükVeri);
        System.out.println(virgüllüSayı);
        System.out.println(virgüllüSayı2);
        System.out.println(karakter);
        System.out.println(isimDogrumu);


        boolean dogruMu = true;
        Scanner inp = new Scanner(System.in);
        if(dogruMu){
            char a = 'a';
            char b = 'k';
            System.out.println(a + b); 
        } else {
            System.out.print("Ekrana değer giriniz : ");
            int k = inp.nextInt();
            System.out.println(k);
        }

        System.out.println("Lütfen iki adet sayı giriniz");
        System.out.print("Sayı 1 : ");
        int say1 = inp.nextInt();
        System.out.print("Sayı 2 : ");
        int say2 = inp.nextInt();

        System.out.println(say1 + say2);






        System.out.print("Lütfen adınızı ve yaşınızı giriniz : ");
        String ad = inp.next();
        int yas2 = inp.nextInt();

        System.out.println("Adınız : " + ad + "   Yaşınız " + yas2 * yas2);






    }
}
