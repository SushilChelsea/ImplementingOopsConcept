package org.sushil.person;

import org.sushil.Address;

/**
 * Created by Sushil on Jan, 2019
 */
public class Teacher extends Person {
    private String position;

    public Teacher(String firstName, String lastName, int citizenshipNumber, Address address, String position) {
        super(firstName, lastName, citizenshipNumber, address);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Teacher" + "\n---------" +"\nPosition:- " + this.position + "\n"+ super.toString();
    }
}
