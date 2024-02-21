package com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.model;

import com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.util.DataValidation;

import java.util.UUID;

public class Person {

    private final String id = UUID.randomUUID().toString();

    @DataValidation(min = 2, max = 15)
    private String firstName;

    @DataValidation(min = 2, max = 15)
    private String lastName;

    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [ " +
                "id: " + id +
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", age: " + age +
                " ]";
    }
}
