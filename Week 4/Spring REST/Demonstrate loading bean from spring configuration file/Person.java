package com.example;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Default Constructor Called");
    }

    // Constructor Injection
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor Injection Used");
    }

    // Setter Injection
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
