package org.sushil;

public class Main {

    public static void main(String[] args) {
        // creating person object with specific address object
        Address ad1 = new Address("Baker street 21", "London", "England");
        Person p1 = new Person("Sushil", "Pun", 5129, ad1);

        System.out.println("---------------------------------------------");
        System.out.println(p1.toString());
        System.out.println("---------------------------------------------");
    }
}
