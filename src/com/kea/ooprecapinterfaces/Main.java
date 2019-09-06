package com.kea.ooprecapinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        // Lav personer
        persons.add(new Person("123456-7890", "Georgina", 150));
        persons.add(new Person("789012-3456", "Anna", 163));
        persons.add(new Person("232457-7321", "Marcus", 187));
        persons.add(new Person("123456-7897", "Frederik", 169));

        System.out.println(persons);
        //sorter data vha Collections.sort(persons)
        Collections.sort(persons);

        System.out.println(persons);
    }
}
