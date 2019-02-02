package org.sushil.faculty;

import org.sushil.person.DepartmentHead;
import org.sushil.person.Student;
import org.sushil.person.Teacher;

import java.util.ArrayList;

/**
 * Created by Sushil on Jan, 2019
 */
public abstract class Faculty {
    private String facultyName;
    private DepartmentHead dh;
//    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
//        this.teachers = teachers;
    }

    public String getFacultyName() {
        return facultyName;
    }

//    public void displayTeachers() {
//        for (int i = 0; i < teachers.size(); i++) {
//            System.out.println( (i+1)+ ": " + teachers.get(i).toString() + "\n");
//            System.out.println();
//        }
//    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public DepartmentHead getDh() {
        return dh;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        System.out.println("Students");
        System.out.println("---------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println( (i+1)+ ": " + students.get(i).toString() + "\n");
            System.out.println();
        }
    }

}
