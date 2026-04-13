package oop.Day2;

public class Student {
    String name;
    int age;
    double grade;

    // Kurucu Metot (Constructor) - Nesne oluştururken kolaylık sağlar
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // --- GÖREV 2: Behavior (Davranışlar) ---
    public void printInfo() {
        System.out.println("Öğrenci: " + name + " | Yaş: " + age + " | Not: " + grade);
    }

    public boolean isPassed() {
        return grade >= 50; // Geçme notunu 50 kabul edelim
    }

    void increaseGrade(double amount){
        this.grade += amount;
    }






}
