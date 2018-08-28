package com.company;

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
    }
}
