package oop.Day1;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();


        s1.name = "Furkan";
        s1.age = 26;
        s1.grade = 80;

        s2.name = "yasin";
        s2.age = 18;
        s2.grade = 56;

        s3.name = "merve";
        s3.age = 54;
        s3.grade = 60;

        s4.name = "kerim";
        s4.age = 15;
        s4.grade = 95;

        s5.name = "yasemin";
        s5.age = 16;
        s5.grade = 100;

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

       for (Student s : students) {

            s.printInfo();
        }

        Student maxStudent = students.get(0);
        double maxNote = students.get(0).grade;

        for (Student s : students){
            if(s.grade > maxNote){
                maxNote = s.grade;
                maxStudent = s;
            }
        }

        System.out.println("En başarılı öğrenci : " + maxStudent.name + " Aldığı not : " + maxStudent.grade);







    }
}
