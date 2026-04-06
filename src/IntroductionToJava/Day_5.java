package IntroductionToJava;

import java.util.Arrays;
import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {

    /*
        int[] num = {1,2,3,4,5};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);



        int[] num = {1,2,3,4,5};
        int total = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
            total += num[i];

        }
        System.out.println();
        System.out.println(total);



        int[] num = {65,65,65,65,65,96};
        int average = 0;

        for(int i : num){
            average += i;
        }
        System.out.println(average / num.length);




        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayı giriniz : ");
        int i = 0;
        int[] arr1 = new int[5];
        while (i < 5){
             arr1[i] = inp.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(arr1));



     */

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen array içinde aradığınız sayıyı giriniz : ");
        int say1 = inp.nextInt();
        boolean dogruMU = false;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == say1) dogruMU= true;
        }
        if (dogruMU == true){
            System.out.println("VAR");
        } else {
            System.out.println("YOK");
        }

    }

}
