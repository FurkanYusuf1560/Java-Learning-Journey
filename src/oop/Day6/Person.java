package oop.Day6;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo(){
        System.out.println("Adınız : " + name + " Yaşınız : " + age);
    }


}
