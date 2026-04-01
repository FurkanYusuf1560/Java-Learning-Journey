package IntroductionToJava;

import java.util.Scanner;
import java.util.Locale;

public class Day_2 {
    private String name;

    public static void main(String[] args) {
    Day_2 day2 = new Day_2();
    day2.Sum();
    day2.Sum(5);
    day2.Sum(4,6);
    day2.Sum(1,2,3);

        Scanner inp = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Lütfen üç adet sayı giriniz : ");
        double say1 = inp.nextDouble();
        double say2 = inp.nextDouble();
        double say3 = inp.nextDouble();

        if(say1 > say2 && say1 > say3) {
            System.out.println("En büyük sayı say1 : " + say1);
        } else if (say2 > say1 && say2 > say3) {
            System.out.println("En büyük sayı say2 : " + say2);
        } else if (say3 > say1 && say3 > say2 ) {
            System.out.println("En büyük sayı say3 : " + say3);
        }


    }

    public int Sum(int say1){
        return 5;
    }
    public int Sum(int say1, int say2){
        return 5;
    }
    public int Sum(int say1 , int say2, int say3){
        return 5;
    }
    public int Sum(){
        return 5;
    }
}
