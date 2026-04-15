package oop.Day5;

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("kerim", 14, 65);
        s1.bankAccount = new BankAccount("Garanti", 500);

        System.out.println(s1.bankAccount);

        s1.bankAccount.deposit(780);
        System.out.println(s1.bankAccount);

        s1.bankAccount.withdraw(300);
        System.out.println(s1.bankAccount);

        s1.bankAccount.showMoney();

    }
}
