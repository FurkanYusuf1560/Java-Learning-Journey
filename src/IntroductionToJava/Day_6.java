package IntroductionToJava;

import java.util.Scanner;

public class Day_6 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String history = ""; // Geçmişi tutacak değişkenimiz

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
                System.out.println("\n===== İŞLEM GEÇMİŞİ =====");
                if (history.equals("")) {
                    System.out.println("Henüz bir işlem yapılmadı.");
                } else {
                    System.out.println(history);
                }
                continue; // Menüye geri dön
            }

            // İşlem yapılacaksa sayıları al
            System.out.print("Birinci sayıyı giriniz: ");
            int say1 = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int say2 = inp.nextInt();

            switch (girilenIslem) {
                case 1 -> {
                    int sonuc = say1 + say2;
                    String kayit = say1 + " + " + say2 + " = " + sonuc;
                    System.out.println("Sayıların toplamı: " + sonuc);
                    history += kayit + "\n"; // Geçmişe ekle
                }
                case 2 -> {
                    int sonuc = say1 - say2;
                    String kayit = say1 + " - " + say2 + " = " + sonuc;
                    System.out.println("Sayıların farkı: " + sonuc);
                    history += kayit + "\n";
                }
                case 3 -> {
                    int sonuc = say1 * say2;
                    String kayit = say1 + " * " + say2 + " = " + sonuc;
                    System.out.println("Sayıların çarpımı: " + sonuc);
                    history += kayit + "\n";
                }
                case 4 -> {
                    if (say2 != 0) {
                        double sonuc = (double) say1 / say2;
                        String kayit = say1 + " / " + say2 + " = " + sonuc;
                        System.out.println("Sayıların bölümü: " + sonuc);
                        history += kayit + "\n";
                    } else {
                        System.out.println("Hata: Bir sayı 0'a bölünemez!");
                    }
                }
                default -> System.out.println("Geçersiz bir seçim yaptınız!");
            }
        }
    }

}