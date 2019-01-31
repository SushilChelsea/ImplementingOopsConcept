package org.sushil;

import org.sushil.person.Person;
import org.sushil.person.Student;
import org.sushil.person.Teacher;

public class Main {

    public static void main(String[] args) {
        // creating person object with specific address object
        Address ad1 = new Address("Baker street 21", "London", "England");
        Teacher t1 = new Teacher("Alex", "Geece", 5129, ad1, "Department Head");

        Student s1 = new Student("Brad", "Traversy", 5529, ad1, 1001);
        System.out.println("---------------------------------------------");
        System.out.println(t1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(s1.toString());
        System.out.println("---------------------------------------------");
    }
}
