package IntroductionToJava;

import java.util.Scanner;
import java.util.Random;

public class Day_4 {


    public static void main(String[] args) {


        // FOR- FOREACH
/*
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı giriniz : ");
        int number = inp.nextInt();
        System.out.print("Faktöriyel " + number + "! : ");
        int fact = 1;
        for (int i = 1; i <= number; number--){
            fact *= number;
        }
        System.out.print ( fact );

    */


      // WHİLE
        /*
        Scanner inp = new Scanner(System.in);
        int totalNum = 0;
        while (true){
            System.out.print("Lütfen bir sayı giriniz : ");
            int num = inp.nextInt();
            totalNum += num;
            if (num == 0) break;
        }
        System.out.println(totalNum);
      */


        Random randomGenerator = new Random();

        int randomInteger = randomGenerator.nextInt(100);
        double randomDouble = randomGenerator.nextDouble(100);

                Scanner inp = new Scanner(System.in);

                int guessedRight = 8; // Toplam hak sayısını burada belirleyelim
                boolean isWin = false;



                System.out.println("0-100 arasında bir sayı tuttum. Tahmin etmeye çalış!");

                while (guessedRight > 0) {
                    System.out.print("Kalan Hak: " + guessedRight + " | Tahmininiz: ");
                    int guessedNum = inp.nextInt();

                    if (guessedNum == randomInteger) {
                        isWin = true;
                        break; // Doğru bildiği an döngüden çık
                    } else if (guessedNum < randomInteger) {
                        System.out.println("Daha büyük bir sayı girmelisin.");
                    } else {
                        System.out.println("Daha küçük bir sayı girmelisin.");
                    }

                    guessedRight--; // Her yanlış tahminde hakkı azalt
                }

                // Oyun bittiğinde durum kontrolü
                if (isWin) {
                    System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz.");
                } else {
                    System.out.println("Maalesef hakkınız bitti. Doğru sayı: " + randomInteger);
                }









    }
}
