package com.kea.ooprecapinterfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        // Lav personer
        persons.add(new Person("123456-7890", "Georgina", 130));
        persons.add(new Person("789012-3456", "Anna", 173));
        persons.add(new Person("232457-7321", "Marcus", 187));
        persons.add(new Person("123456-7897", "Frederik", 207));

        //sorter data vha Collections.sort(persons)

    }
}
