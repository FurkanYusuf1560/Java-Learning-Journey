package oop.Day3;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

       List<Student> students = new ArrayList<Student>();

        Student s1 = new Student("yasin", 26, 98);
        Student s2 = new Student("Furkan", 28, 28);
        Student s3 = new Student("kemal", 29, 58);
        Student s4 = new Student("şakir", 27, 78);
        Student s5 = new Student("ahmet", 22, 68);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

       double classAvarage = 0.0;

       for (Student s : students){
           classAvarage += s.grade;
       }
       System.out.println(students + "\n");
       System.out.println("Sınıf Ortalaması : "+ classAvarage / students.size() +  "\n");


       for(Student s : students){
           if(s.grade > 60){
               System.out.println(s);
           }
       }




    }
}
