package oop.Day2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("furkan", 25, 50));
        students.add(new Student("yasin", 20, 75));
        students.add(new Student("şakir", 18, 90));

        boolean isPassed = false;

        for(Student s : students){
            s.printInfo();
            if(s.isPassed() == true) System.out.println("Geçti");
        }

        int avarage = 0;
        for(Student s : students){
            avarage += s.grade;
        }
        System.out.println("Sınıf ortalaması " + avarage / students.size());



    }
}
