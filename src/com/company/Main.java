package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        Person kamil = new Person("kamil", "parzych", 32);

        System.out.println(kamil);

        Person jacek = new Person("jacek", "popiołek", 36);

        System.out.println(jacek);

        System.out.println(kamil.equals(jacek));

        Person youngKamil = new Person("kamil", "parzych", 16);

        System.out.println(kamil.equals(youngKamil));

        Student jan = new Student("jan", "kowalski", 22, "123456");

        System.out.println(jan.equals(jacek));

        ArrayList<Person> people = new ArrayList<>();
        people.add(kamil);
        people.add(jacek);
        people.add(jan);
//        people.add("nowa osoba");
        System.out.println(people);

//        for (Object person : people) {
//            Person person1 = (Person) person;
//
//            System.out.println(person1.getFullName());
//        }
        for (Person person : people) {
            System.out.println(person.getFullName());
        }

        System.out.println(people.contains(kamil));
        System.out.println(people.contains(youngKamil));

        people.add(kamil);
        System.out.println(people.size());
    }
}
