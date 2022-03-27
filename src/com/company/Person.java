package com.company;

public class Person {

// 1. fields
    int id;
    String name;
    String lastname;
    int age;


// 2. constructor

    public Person(){
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(int id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    // 3. methods

}
