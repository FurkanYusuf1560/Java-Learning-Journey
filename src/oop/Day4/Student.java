package oop.Day4;

public class Student {
    String name;
    int age;
    double grade;
    Course courseName;
    Course courseGrade;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        if (grade < 0 || grade > 100) {
            grade = 0;
        }
    }

    Student(Course courseName, Course courseGrade){
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

    @Override
    public String toString(){
        return "Name : " + name + " Age : " + age + " Grade : " + grade;
    }

     void printInfo() {
        System.out.println(this.name + " " + this.age + " " + this.grade);
    }

    void increaseGrade(double amount) {
        this.grade += amount;
    }

    void decreaseGrade(double amount) {
        this.grade -= amount;
    }


}
