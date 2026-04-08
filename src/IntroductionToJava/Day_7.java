package IntroductionToJava;

public class Day_7 {

    public static int sum(int a, int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }

    public static int muxNum(int a, int b){
        int result = Math.max(a, b);
        System.out.println(result);
        return result;
    }

    public static int isEven(int a ){
        if(a % 2 == 0){
            System.out.println("Sayı çift");
        } else System.out.println("Sayı tek");
        return a;
    }

    public static void main(String[] args) {


        sum(5, 4);
        muxNum(9,17);
        isEven(264862486);


        }

    }



