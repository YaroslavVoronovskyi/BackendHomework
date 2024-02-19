package com.gmail.vorononovskyi.yaroslav.isg.homework.second.model;

import com.gmail.vorononovskyi.yaroslav.isg.homework.second.Constants;

public class Engineer extends Employee{
    public Engineer(int id, String firstName, String lastName, String position, int salary, int experience, int age, String grade) {
        super(id, firstName, lastName, position, salary, experience, age, grade);
    }

    @Override
    public int getSalary() {
        return calculateSalary();
    }

    @Override
    protected int calculateSalary() {
        return (int) (Constants.BASE_SALARY * experience * 1.5);
    }
}
