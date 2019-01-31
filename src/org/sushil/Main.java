package org.sushil;

import org.sushil.person.Student;
import org.sushil.person.Teacher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creating person object with specific address object
        /*
        Address ad1 = new Address("Baker street 21", "London", "England");
        Teacher t1 = new Teacher("Alex", "Geece", 5129, ad1, "Department Head");

        Student s1 = new Student("Brad", "Traversy", 5529, ad1, 1001);
        System.out.println("---------------------------------------------");
        System.out.println(t1.toString());
        System.out.println("---------------------------------------------");
        System.out.println(s1.toString());
        System.out.println("---------------------------------------------");

        */
        Scanner input = new Scanner(System.in);
        // how many teacher user want to enter
        System.out.print("How many Teacher do you want to add? ");
        int teacherNo = input.nextInt();
        // variable declaration and initialization
        int count = 0;
        String firstName="";
        String lastName="";
        int citizenNo=0;
        String street="", city="", country="";
        Teacher[] t = new Teacher[teacherNo];
        Address [] ad = new Address[teacherNo];
        String [] position = new String[teacherNo];

        // continue loop until user input details about all teachers
        while (count < teacherNo) {
            System.out.print("Enter Teacher First-name ? ");
            firstName = input.next();
            System.out.print("Enter Teacher Last-name ? ");
            lastName = input.next();
            System.out.print("Enter Teacher Citizenship Number ? ");
            citizenNo = input.nextInt();
            // while user input invalid citizen number keep prompting to enter valid number
            while (citizenNo <= 0) {
                System.out.print("Enter valid Citizenship Number : ");
                citizenNo = input.nextInt();
            }
            /*
             * That's because the Scanner.nextInt method does not read the newline character
             * in your input created by hitting "Enter," and so the call to Scanner.nextLine returns
             * after reading that newline.
             */
            input.nextLine();
            System.out.print("Position:- ");
            position[count] = input.nextLine();
            System.out.println("Address");
            System.out.print("Street: ");
            street = input.nextLine();
            System.out.print("City: ");
            city = input.nextLine();
            System.out.print("Country: ");
            country = input.nextLine();
            ad[count] = new Address(street, city, country);
            t[count] = new Teacher(firstName, lastName, citizenNo, ad[count], position[count]);
            count++; // incrementing count, so that loop exits at one point
        }

        for (int i = 0; i < teacherNo; i++) {
            System.out.println("---------------------------------------------");
            System.out.println(t[i].toString());
            System.out.println("---------------------------------------------");
        }
    }
}
