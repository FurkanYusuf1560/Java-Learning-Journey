package oop.Day2;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        // --- GÖREV 3: 3 Öğrenci Oluşturma ---
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 20, 85.5));
        students.add(new Student("Ayşe", 21, 45.0));
        students.add(new Student("Mehmet", 19, 92.0));



        System.out.println("--- Öğrenci Listesi ve Durumları ---");
        for (Student s : students) {
            s.printInfo();
            String status = s.isPassed() ? "Geçti ✅" : "Kaldı ❌";
            System.out.println("Durum: " + status);
        }

        System.out.println("\n--- Mini Challenge Sonuçları ---");

        // --- Challenge 1: En Yüksek Notlu Öğrenciyi Bul ---
        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.grade > topStudent.grade) {
                topStudent = s;
            }
        }
        System.out.println("🎯 En yüksek notlu öğrenci: " + topStudent.name + " (" + topStudent.grade + ")");

        // --- Challenge 2: Kaç Kişi Geçti? ---
        int passedCount = 0;
        for (Student s : students) {
            if (s.isPassed()) {
                passedCount++;
            }
        }
        System.out.println("🎯 Geçen öğrenci sayısı: " + passedCount);

        // --- Challenge 3: Ortalama Not Hesapla ---
        double totalGrade = 0;
        for (Student s : students) {
            totalGrade += s.grade;
        }
        double average = totalGrade / students.size();
        System.out.printf("🎯 Sınıf ortalaması: %.2f\n", average);



    }

}
