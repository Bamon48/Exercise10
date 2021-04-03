package com.company.Amon;

// Person class
public class Person {
    private String name;
    private String email;

    // Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methods
    @Override
    public String toString() {
        return "Name: " + getName() + " | Email: " + getEmail() + "\n";
    }
}
