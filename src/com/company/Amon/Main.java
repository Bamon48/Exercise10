/*
Benton Amon
Exercise 10
 */

package com.company.Amon;


import java.util.ArrayList;
import java.util.List;


interface Collection {
    void list();
}

class Contacts implements Collection {
    private ArrayList<Person> book;

    // Constructor
    public Contacts() {
        book = new ArrayList<>();
    }

    // 'Add' method
    public void add(Person person) {
        book.add(person);
    }

    // Uses a for each loop to display every Contact in the List 'book'
    @Override
    public void list() {
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Contacts book = new Contacts();

        Person person1 = new Person("Jerry", "totallynotacat@gmail.com");
        Person person2 = new Person("Ron", "parksrec@gmail.com");
        Person person3 = new Person("Jim", "sales@gmail.com");


        try {

            book.add(person1);
            book.add(person2);
            book.add(person3);

            book.list();

        } catch (NullPointerException e) {
            System.out.println("Kept getting this for some reason.");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }
}
