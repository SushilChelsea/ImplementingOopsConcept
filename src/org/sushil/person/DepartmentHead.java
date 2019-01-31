package org.sushil.person;

import org.sushil.Address;

import java.util.ArrayList;

/**
 * Created by Sushil on Jan, 2019
 */
public class DepartmentHead extends Person {
    private String position = "Department Head";
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public DepartmentHead(String firstName, String lastName, int citizenshipNumber, Address address) {
        super(firstName, lastName, citizenshipNumber, address);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void totalTeam() {
        System.out.println("Department Head: " + super.getFirstName() + super.getLastName());
        System.out.println("---------------");
        System.out.println("Teachers Under");
        System.out.println("---------------");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println( (i+1)+ ": " + teachers.get(i).toString());
            System.out.println();
        }
    }
}
