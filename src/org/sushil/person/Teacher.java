package org.sushil.person;

import org.sushil.Address;

import java.util.Scanner;

/**
 * Created by Sushil on Jan, 2019
 */
public class Teacher extends Person {
    private String position;

    public Teacher(String firstName, String lastName, int citizenshipNumber, Address address, String position) throws Exception {
        super(firstName, lastName, citizenshipNumber, address);
        if (position.equals("Department Head")) {
            // if teacher initialized position is Department Head change it calling setPosition method
            setPosition(position);
        } else {
            this.position = position;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        Scanner input = new Scanner(System.in);
        while (position.equals("Department Head")) {
            System.out.print("Enter Teacher Position except \"Department Head\" : ");
            String str = input.nextLine();
            position = str;
        }
        this.position = position;
    }

    public String toString() {
        return "Teacher" + "\n-----------" +"\nPosition:- " + this.position + "\n"+ super.toString();
    }
}
