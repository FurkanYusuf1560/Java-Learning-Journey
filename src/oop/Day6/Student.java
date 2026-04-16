package oop.Day6;

public class Student extends Person{
    double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void printInfo(){
        System.out.println("Adınız : " + name + " Yaşınız : " + age + " Notunuz : " + grade);
    }
}
