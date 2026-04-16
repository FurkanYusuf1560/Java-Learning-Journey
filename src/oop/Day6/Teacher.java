package oop.Day6;

public class Teacher extends Person{
    double salary;

    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    @Override
    void printInfo(){
        System.out.println("Adınız : " + name + " Yaşınız : " + age + " Maaşınız  : " + salary);
    }
}
