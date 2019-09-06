package com.kea.ooprecapinterfaces;

public class Person implements Comparable<Person>
{
    String cpr;
    String name;
    int height;

    public Person(String cpr, String name, int height)
    {
        this.cpr = cpr;
        this.name = name;
        this.height = height;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nCpr: " + cpr + " Navn: " + name + " Højde: " + height;

    }

    @Override
    public int compareTo(Person person)
    {
        //returner negativ hvis this.height er mindre
        //          0 hvis lig med
        //          positiv hvis this.height er større
        return this.height - person.height;
    }

}
