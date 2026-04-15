package oop.Day5;

public class Student {

    private String name;
    private int age;
    private double grade;
    BankAccount bankAccount;

    Student(String name, int age, double grade){
        this.name = name;
        if(age<0){
            System.out.println("Yaş negatif olamaz");
        } else {
            this.age = age;
        }

        if (grade < 0 || grade > 100){
            System.out.println("geçersiz bir not değeri girdiniz 0 ile 100 arasında bir değer giriniz");
        } else {
            this.grade = grade;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name1){
        this.name = name1;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age1){
        this.age = age1;
    }

    public double getGrade(){
        return  this.grade;
    }

    public void setGrade(double grade1){
            this.grade = grade1;
    }

    @Override
    public String toString(){
        return "Name :" + name + "  Yaş :" + age + "  Not :" + grade;
    }




}
