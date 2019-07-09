package com.company;
public class Customer {
    private int number;
    private String firstName;
    private String lastName;

    public Customer (int number,String firstName,String lastName){
        this.setNumber(number);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
}