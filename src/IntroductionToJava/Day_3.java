package IntroductionToJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Day_3 {

    static List<Integer> sumMethodNumbers = new ArrayList<>();
    static List<Integer> multiplyMethodNumbers = new ArrayList<>();

    public static void sumNumber(int num) {
        sumMethodNumbers.add(num); // Listeye yeni sayıyı ekler

        int total = 0;
        for (int i : sumMethodNumbers) { // Listedeki tüm sayıları döner
            total += i;
        }
        System.out.println("Listenin Güncel Toplamı: " + total);
    }


    public static void multiplyNumber(int num){
        multiplyMethodNumbers.add(num);

        int total = 1;
        for (int i : multiplyMethodNumbers){
            total *= i;
        }
        System.out.println("Total of Numbers : " + total);
    }


    public static void main(String[] args) {

        System.out.println("                Little Calculator");
        System.out.println("           -----------MENU--------------");
        System.out.println("              1. SUM");
        System.out.println("              2. MINUS");
        System.out.println("              3. MULTIPLY");
        System.out.println("              4. DIVIDEDBY");
        System.out.print("Please select which operation you want : ");
        Scanner inp = new Scanner(System.in);
        int chosedOperation = inp.nextInt();

        switch (chosedOperation) {
            case 1 -> {
                System.out.print("Please choose how many numbers you want to sum : ");
                int chosedNumbers = inp.nextInt();

                for (int i = 1; i<= chosedNumbers; i++){
                    System.out.print("please enter number : ");
                    int selectedNumbers = inp.nextInt();
                    sumNumber(selectedNumbers);
                }

            }
            case 2 ->  {
                System.out.print("Please choose  numbers you want to Minus : ");
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();
                int total = num1 - num2;
                System.out.println("num1 - num2 equals : " + total);
            }
            case 3 ->  {
                System.out.print("Please choose how many numbers you want to Multiply : ");
                int chosedNum = inp.nextInt();
                for (int i = 1; i<= chosedNum; i++){
                    System.out.print("please enter number : ");
                    int selectNum = inp.nextInt();
                    multiplyNumber(selectNum);
                }
            }
            case 4 ->  {
                System.out.print("Please choose which numbers you want to Dividedby : ");
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();
                int total = num1 / num2;
                System.out.println("num1 / num2 equals : " + total);
            }
        }

    }


}
