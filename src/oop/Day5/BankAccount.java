package oop.Day5;

public class BankAccount {
     private String bankName;
     private double moneyAmount = 500;

    public BankAccount(String bankName, double moneyAmount) {
        this.bankName = bankName;
        this.moneyAmount = moneyAmount;
    }

    public void deposit(double dopesMoney){
        this.moneyAmount += dopesMoney;
    }

    public void withdraw(double withdrawMoney){
        this.moneyAmount -= withdrawMoney;
    }

    public void showMoney(){
        System.out.println(this.moneyAmount);
    }

    public String toString(){
        return " Banka ismi : " + bankName +" bankası   " + " bankadaki para : " + moneyAmount;
    }
}
