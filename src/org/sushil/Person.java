package org.sushil;

/**
 * Created by Sushil on Jan, 2019
 */
public class Person {
    private String firstName;
    private String lastName;
    private int citizenshipNumber;
    private Address address;

    public Person(String firstName, String lastName, int citizenshipNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenshipNumber = citizenshipNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(int citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "First name:- " + this.firstName + "\nLast name:- " +
                this.lastName + "\nCitizenship No:- " + this.citizenshipNumber +
                "\nAddress:- " + address.getStreet() + ", " + address.getCity() + ", " + address.getCountry();
    }
}
