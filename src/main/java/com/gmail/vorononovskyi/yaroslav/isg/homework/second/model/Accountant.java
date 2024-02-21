package com.gmail.vorononovskyi.yaroslav.isg.homework.second.model;

import com.gmail.vorononovskyi.yaroslav.isg.homework.second.Constants;

public class Accountant extends Employee {
    public Accountant(int id, String firstName, String lastName, String position, int salary, int experience, int age, String grade) {
        super(id, firstName, lastName, position, salary, experience, age, grade);
    }

    @Override
    public int getSalary() {
        return calculateSalary();
    }

    @Override
    protected int calculateSalary() {
        return (int) (Constants.BASE_SALARY * experience * 0.9);
    }

    @Override
    public String toString() {
        return "Accountant [" +
                "firstName:'" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", position: '" + position + '\'' +
                ", salary: " + salary + "$" +
                ", experience: " + experience +
                ", age: " + age +
                ", grade: '" + grade + '\'' +
                " ]";
    }
}

