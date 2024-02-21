package com.gmail.vorononovskyi.yaroslav.isg.homework.second;

import com.gmail.vorononovskyi.yaroslav.isg.homework.second.model.Accountant;
import com.gmail.vorononovskyi.yaroslav.isg.homework.second.model.Employee;
import com.gmail.vorononovskyi.yaroslav.isg.homework.second.model.Engineer;
import com.gmail.vorononovskyi.yaroslav.isg.homework.second.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> corporateOrganization = new ArrayList<>();
        corporateOrganization.add(new Engineer(1, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 1, 30, "Junior"));
        corporateOrganization.add(new Engineer(2, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 2, 30, "Middle"));
        corporateOrganization.add(new Engineer(3, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 3, 30, "Middle"));
        corporateOrganization.add(new Engineer(4, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 4, 30, "Senior"));
        corporateOrganization.add(new Engineer(5, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 5, 30, "Lead"));

        corporateOrganization.add(new Accountant(6, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 1, 30, "Junior"));
        corporateOrganization.add(new Accountant(7, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 2, 30, "Middle"));
        corporateOrganization.add(new Accountant(8, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 3, 30, "Middle"));
        corporateOrganization.add(new Accountant(9, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 4, 30, "Senior"));
        corporateOrganization.add(new Accountant(10, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 5, 30, "Lead"));

        corporateOrganization.add(new Manager(11, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 1, 30, "Junior"));
        corporateOrganization.add(new Manager(12, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 2, 30, "Middle"));
        corporateOrganization.add(new Manager(13, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 3, 30, "Middle"));
        corporateOrganization.add(new Manager(14, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 4, 30, "Senior"));
        corporateOrganization.add(new Manager(15, "Yaroslav", "Voronovskyi", "Fullstack",
                500, 5, 30, "Lead"));

        for (Employee employee : corporateOrganization) {
            System.out.println(employee);
        }

        for (Employee employee : corporateOrganization) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " "
                    + " " + employee.getSalary() + "$");
        }
    }
}
