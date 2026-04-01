package IntroductionToJava;

import java.util.Scanner;

public class LearningMethod {
    private int yas;
    private String isim;
    private long tckn;
    private boolean resıtMi;

    LearningMethod(int yas1, String isim1, long tckn, boolean resıtMi){
        this.yas = yas1;
        this.isim = isim1;
        this.tckn = tckn;
        this.resıtMi = resıtMi;
    }

    LearningMethod(){

    }

    LearningMethod(int yas2){

    }

    LearningMethod(String isim , boolean resit){}

    public static int Topla(){
        System.out.println("topla");
        return 5;
    }

    public static int Carp(){
        System.out.println("carp");
        return 5;
    }

    public static int Cıkar(){
        System.out.println("cıkar");
        return 5;
    }

     void bol(){
        System.out.println("bol");
    }

    public double parcala(){
        return 5.5;
    }

    public static void main(String[] args) {
/*
        Topla();
        Carp();
        Cıkar();
        LearningMethod a = new LearningMethod();
        a.bol();
        LearningMethod b = new LearningMethod();
*/
        Scanner inp = new Scanner(System.in);
        int chosedNumbers = inp.nextInt();
        int selectedNumbers = 0;

        for (int i = 1; i<= chosedNumbers; i++){
             selectedNumbers = inp.nextInt();
             int[] numbers = new int[selectedNumbers];
        }



    }


}
