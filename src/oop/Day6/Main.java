package oop.Day6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("furkan", 45);
        Student s1 = new Student("Kerim", 40, 90);
        Teacher t1 = new Teacher("can", 35, 75000);

        p1.printInfo();
        s1.printInfo();
        t1.printInfo();

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(s1);
        people.add(t1);

        for(Person p : people){
            p.printInfo();
        }


    }
}
