package oop.Day4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Furkan", 25, 80);
        Student s2 = new Student("Yusuf", 22, 70);
        Student s3 = new Student("Çevik", 23, 50);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);
        double total=0;
        for(Student s : students){
            total += s.grade;
        }
        System.out.println(total / students.size());

        for(Student s : students){
            if(s.grade > 60){
                System.out.println(s.name + " :  Geçtiniz");
            } else {
                System.out.println(s.name + " :  kaldınız");
            }
        }

        s1.decreaseGrade(30);
        s2.decreaseGrade(25);
        s3.increaseGrade(50);

        System.out.println(" ");

        for(Student s : students){
            if(s.grade > 60){
                System.out.println(s.name + " :  Geçtiniz");
            } else {
                System.out.println(s.name + " :  kaldınız");
            }
        }


    }
}
