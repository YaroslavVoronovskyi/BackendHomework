package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth;

import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotFoundUserException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.UserAlreadyExistException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotValidAgeException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotValidNameException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.model.User;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.service.UserService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();


        System.out.println("create() method --------------------------------------");
        // Check create() method should add new User
        User firstUser = userService.create(new User(1, "Yaroslav", "Voronovskyi", 30, false));
        System.out.println(firstUser);

        System.out.println("create() method --------------------------------------");
        // Check create() method should throw NotValidNameException
        try {
            User secondUser = userService.create(new User(2, "Y", "Voronovskyi", 30, false));
            System.out.println(secondUser);
        } catch (NotValidNameException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("create() method ---------------------------------------");
        // Check create() method should throw NotValidNameException
        try {
            User thirdUser = userService.create(new User(3, "Yaroslav", "V", 30, false));
            System.out.println(thirdUser);
        } catch (NotValidNameException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("create() method ---------------------------------------");
        // Check create() method should throw NotValidAgeException
        try {
            User fourthUser = userService.create(new User(4, "Yaroslav", "Voronovskyi", 17, false));
            System.out.println(fourthUser);
        } catch (NotValidAgeException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("create() method ---------------------------------------");
        // Check create() method should add new User
        try {
            User fifthUser = userService.create(new User(5, "Yaroslav", "Voronovskyi", 30, false));
            System.out.println(fifthUser);
        } catch (UserAlreadyExistException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("update() method ---------------------------------------");
        // Check update() method should throw NotValidNameException
        try {
            firstUser = userService.update(new User(1, "Y", "Voronovskyi", 30, true));
            System.out.println(firstUser);
        } catch (NotValidNameException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("remove() method ---------------------------------------");
        // Check remove() method should remove User and after second call throw NotFoundUserException
        try {
            System.out.println(firstUser);
            userService.remove(firstUser);
            userService.remove(firstUser);
        } catch (NotFoundUserException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("getAll() method ---------------------------------------");
        // Check getAll() method should return list Users
        System.out.println(userService.getAll());

        System.out.println("get() method ------------------------------------------");
        // Check get() method should return User and then set block true
        User useFromDB = userService.get(1);
        System.out.println(useFromDB);
        useFromDB.setBlock(true);
        System.out.println(useFromDB);
    }
}