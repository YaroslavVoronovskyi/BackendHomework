package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.model;

import java.util.Objects;

public class User {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private boolean block;

    public User(int id, String firstName, String lastName, int age, boolean block) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.block = block;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isBlock() {
        return block;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "User [ " +
                "id: " + id +
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", age: " + age +
                ", block: " + block +
                " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age
                && block == user.block
                && firstName.equals(user.firstName)
                && lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, block);
    }
}
