package org.sushil;

import org.sushil.faculty.Faculty;

/**
 * Created by Sushil on Feb, 2019
 */
public class College {
    private String collegeName = "Uptown Country College";
    private Faculty faculty;
    private Address address;

    public College(Faculty faculty) {
        this.faculty = faculty;
        address = new Address("Jorpati-10", "Kathmandu", "Nepal");
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
