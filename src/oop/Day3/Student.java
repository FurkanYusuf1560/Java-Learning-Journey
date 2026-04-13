package oop.Day3;

public class Student {
    String name;
    int age;
    double grade;

    Student(String name1, int age1, double grade1){
        this.name = name1;
        this.age = age1;
        this.grade = grade1;
    }

    Student(String name2, int age2){
        this.name = name2;
        this.age = age2;
    }

    Student(String name3){
        this.name = name3;
    }

    Student(){}

    @Override
    public String toString(){
        return "İsim " + name + " Yaş " + age + " Not " + grade;
    }




}
