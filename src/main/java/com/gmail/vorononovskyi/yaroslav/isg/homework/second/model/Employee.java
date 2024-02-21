package com.gmail.vorononovskyi.yaroslav.isg.homework.second.model;

import java.util.Objects;

public abstract class Employee {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected int salary;
    protected int experience;
    protected int age;
    protected String grade;

    public Employee(int id, String firstName, String lastName, String position, int salary, int experience, int age, String grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

   protected abstract int calculateSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary
                && experience == employee.experience
                && age == employee.age
                && firstName.equals(employee.firstName)
                && lastName.equals(employee.lastName)
                && position.equals(employee.position)
                && grade.equals(employee.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, position, salary, experience, age, grade);
    }
}
