package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("_____Person kamil = new Person(\"kamil\", \"parzych\", 32);");

        Person kamil = new Person("kamil", "parzych", 32);
        System.out.println(kamil);                                                      //wygląd tego wydruku określa metoda toString z klasy person

        Person jacek = new Person("jacek", "popiołek", 36);
        System.out.println(jacek);

        System.out.println("_____Czy kamil.equals(jacek)?  " + kamil.equals(jacek));

        Person youngKamil = new Person("kamil", "parzych", 16);
        System.out.println("_____Czy kamil.equals(youngKamil)?  " + kamil.equals(youngKamil));               //jest true bo zrobiliśmy nową metodę equals w klasie person, która nie uwzglednia pola "age"

        Student jan = new Student("jan", "kowalski", 22, "123456");

        System.out.println("_____Czy jan.equals(jacek)?  " + jan.equals(jacek));

        System.out.println("\n_______________ArrayList_______________");
        ArrayList<Person> people = new ArrayList<>();
        people.add(kamil);
        people.add(jacek);
        people.add(jan);
//        people.add("nowa osoba");                                                         //nie możemy dodać stringa bo jest to typ niezgodny z typem tej listy
        System.out.println(people);                             //wypisuje wszystkie elementy listy godnie z metodą toString

//        for (Object person : people) {
//            Person person1 = (Person) person;
//            System.out.println(person1.getFullName());
//        }
        for (Person person : people) {
            System.out.println(person.getFullName());
        }

        System.out.println("Czy people.contains(kamil)?  " + people.contains(kamil));
        System.out.println("Czy people.contains(youngKamil)?  " + people.contains(youngKamil));

        people.add(kamil);
        System.out.println("people.size():  " + people.size());                         //ten sam kamil występuje w tej liście dwukrotnie
        System.out.println(people);

        System.out.println("\n________________HashSet________________");
        HashSet<Person> set = new HashSet<>();
        set.add(kamil);
        set.add(jacek);
        set.add(jan);
        set.add(kamil);
        set.add(youngKamil);
        System.out.println("set.size():  " + set.size());                            //rozmiar seta jest 4 pomimo tego, że dodaliśmy 5 elementów (nie mogą być duplikaty)
        System.out.println("set:" + set);                                            //wypisuje elementy kolekcji set (kolejność w set nie jest istotna)

        System.out.println("\n________________HashMap________________");
        HashMap<String, Person> map = new HashMap<>();
        map.put("kamil", kamil);
        map.put("kamilparzych", kamil);
        System.out.println("map:" + map);
        System.out.println(map.get("kamil"));
        System.out.println(map.get("jacek"));

        Animal horse = new Animal("horse");
        Animal rabbit = new Animal("rabbit");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(horse);
        animals.add(rabbit);
        System.out.println(animals);

        ArrayList<RepresentableByFullName> fullNameArrayList = new ArrayList<>();
        fullNameArrayList.addAll(people);
        fullNameArrayList.addAll(animals);

        for (RepresentableByFullName object : fullNameArrayList) {
            System.out.println(object.getFullName());
        }

    }
}
