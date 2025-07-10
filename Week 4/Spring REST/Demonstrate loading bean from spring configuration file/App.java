package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Constructor-injected singleton
        Person p1 = (Person) context.getBean("personConstructor");
        p1.display();

        // Setter-injected prototype
        Person p2 = (Person) context.getBean("personSetter");
        p2.display();

        // Checking prototype scope (should be different instances)
        Person p3 = (Person) context.getBean("personSetter");
        System.out.println("p2 == p3? " + (p2 == p3));  // should print false
    }
}
