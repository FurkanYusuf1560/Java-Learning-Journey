package oop.Day5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Furkan", 25, 50);
        Student s2 = new Student("Yusuf", 27, 75);
        Student s3 = new Student("Çevik", 23, 60);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student s : students){
            System.out.println(s);
        }
        System.out.println(s1);
        s1.setName("yasin");
        s1.setAge(50);
        s1.setGrade(75);
        System.out.println(s1);


    }
}
