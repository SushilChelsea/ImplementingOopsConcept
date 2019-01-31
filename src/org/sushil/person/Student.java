package org.sushil.person;

import org.sushil.Address;

/**
 * Created by Sushil on Jan, 2019
 */
public class Student extends Person{
    private int rollNo;

    public Student(String firstName, String lastName, int citizenshipNumber, Address address, int rollNo) {
        super(firstName, lastName, citizenshipNumber, address);
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Student" + "\n---------" +"\nRoll No:- " + this.rollNo + "\n"+ super.toString();
    }
}
