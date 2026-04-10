package oop.Day1;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();



        s1.name = "Furkan";
        s1.age = 26;
        s1.grade = 80;

        s1.printInfo();

        s2.name = "yasin";
        s2.age = 18;
        s2.grade = 56;

        s2.printInfo();

        s3.name = "merve";
        s3.age = 54;
        s3.grade = 60;

        s3.printInfo();


        Student[] arr1 = {s1, s2, s3};

        Student maxStudent = arr1[0]; // İlk öğrenciyi başlangıçta en yüksek kabul ediyoruz
        double maxGrade = arr1[0].grade;

        for (Student s : arr1) {
            if (s.grade > maxGrade) {
                maxGrade = s.grade;
                maxStudent = s; // En yüksek notu alan nesneyi güncelliyoruz
            }
        }

        System.out.println("En yüksek notu alan öğrenci: " + maxStudent.name + " Notu: " + maxGrade);




    }



}
