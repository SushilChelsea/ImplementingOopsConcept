package org.sushil;

import org.sushil.faculty.Software;
import org.sushil.person.DepartmentHead;
import org.sushil.person.Student;
import org.sushil.person.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creating address object
        Address ad1 = new Address("Baker street 21", "London", "England");
        Address ad2 = new Address("Cannor Street 201", "London", "England");
        Address ad3 = new Address("Chancery Lane 101", "London", "England");
        Teacher t1 = null, t2 = null, t3 = null;
        DepartmentHead hd = null;
        try {
            t1 = new Teacher("Alex", "Geece", 5129, ad1, "Senior Lecture");
            t2 = new Teacher("John", "Jones", 5139, ad2, "Associate Lecture");
            t3 = new Teacher("David", "Luiz", 5149, ad3, "Associate Lecture");
        } catch (Exception e) {
            System.out.println("Teacher Position can't be initialized to Department Head.");;
        } finally {
            hd = new DepartmentHead("Frank", "Lampard", 5147, ad1);
            hd.addTeacher(t1);
            hd.addTeacher(t2);
            hd.addTeacher(t3);

        }

        Student s1 = new Student("Brad", "Traversy", 5789, ad1, 1001);
        Student s2 = new Student("Birat", "Avatar", 5634, ad2, 1002);
        Student s3 = new Student("Krishna", "Das", 5476, ad3,  1003);

        Software sf = new Software("Software Department",  hd);
        sf.addStudents(s1);
        sf.addStudents(s2);
        sf.addStudents(s3);
        /*
        System.out.println(sf.getFacultyName());
        System.out.println("------------------");
        sf.getDh().totalTeam();
        System.out.println();
        System.out.println("---------------");
        sf.displayStudents();
        */
        College college = new College(sf);
        System.out.println();
        System.out.println("College: " + college.getCollegeName());
        System.out.println();
        System.out.println(college.getFaculty().getFacultyName());
        System.out.println("------------------");
        college.getFaculty().getDh().totalTeam();
//        sf.getDh().totalTeam();
        System.out.println();
        System.out.println("---------------");
        college.getFaculty().displayStudents();
//        sf.displayStudents();


//        System.out.println("---------------------------------------------");
//        System.out.println(t1.toString());
//        System.out.println("---------------------------------------------");
//        System.out.println(s1.toString());
//        System.out.println("---------------------------------------------");


    }
}
