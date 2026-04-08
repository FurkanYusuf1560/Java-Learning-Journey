package IntroductionToJava;

import java.util.Scanner;

public class Calculator_Refactor {
    static String history = "";

    public static int sum(int  say1 , int say2 ){
        int sonuc = say1 + say2;
        String kayit = say1 + " + " + say2 + " = " + sonuc;
        System.out.println("Sayıların toplamı: " + sonuc);
        history += kayit + "\n"; // Geçmişe ekle
        return sonuc;
    }

    public static int minus(int  say1 , int say2 ){
        int sonuc = say1 - say2;
        String kayit = say1 + " - " + say2 + " = " + sonuc;
        System.out.println("Sayıların farkı: " + sonuc);
        history += kayit + "\n";
        return sonuc;
    }
    public static int multiply(int  say1 , int say2 ){
        int sonuc = say1 * say2;
        String kayit = say1 + " * " + say2 + " = " + sonuc;
        System.out.println("Sayıların çarpımı: " + sonuc);
        history += kayit + "\n";
        return sonuc;
    }
    public static int dididedby(int  say1 , int say2 ){
        if (say2 != 0) {
            double sonuc = (double) say1 / say2;
            String kayit = say1 + " / " + say2 + " = " + sonuc;
            System.out.println("Sayıların bölümü: " + sonuc);
            history += kayit + "\n";
        } else {
            System.out.println("Hata: Bir sayı 0'a bölünemez!");
        }
        return say1;
    }

    public static String history(String history){
        System.out.println("\n===== İŞLEM GEÇMİŞİ =====");
        if (history.equals("")) {
            System.out.println("Henüz bir işlem yapılmadı.");
        } else {
            System.out.println(history);
        }
        return history;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         // Geçmişi tutacak değişkenimiz

        System.out.println("--------------Gelişmiş Calculator + History-------------");

        while (true) {
            System.out.println("\n--------------MENÜ-----------------");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("5- Geçmişi Gör");
            System.out.println("6- Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

            int girilenIslem = inp.nextInt();

            // Çıkış kontrolü
            if (girilenIslem == 6) {
                System.out.println("Programdan çıkılıyor... Hoşça kalın!");
                break;
            }

            // Geçmişi görme kontrolü (Sayı istemeden önce yapmalıyız)
            if (girilenIslem == 5) {
                history(history);
                continue;
            }

            // İşlem yapılacaksa sayıları al
            System.out.print("Birinci sayıyı giriniz: ");
            int say1 = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int say2 = inp.nextInt();

            switch (girilenIslem) {
                case 1 -> sum(say1, say2);
                case 2 -> minus(say1, say2);
                case 3 -> multiply(say1, say2);
                case 4 -> dididedby(say1, say2);
                default -> System.out.println("Geçersiz bir seçim yaptınız!");
            }
        }
    }

}
