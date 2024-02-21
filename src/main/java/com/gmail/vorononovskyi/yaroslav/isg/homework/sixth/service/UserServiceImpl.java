package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.service;

import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.Constants;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotFoundUserException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.UserAlreadyExistException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotValidAgeException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception.NotValidNameException;
import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> usersList = new ArrayList<>();

    @Override
    public User create(User user) {
        if (getAll().contains(user)) {
            throw new UserAlreadyExistException();
        } else if (user.getFirstName().length() < Constants.MIN_NAME_LENGTH  | user.getLastName().length() < Constants.MIN_NAME_LENGTH ) {
            throw new NotValidNameException();
        } else if (user.getAge() < Constants.MIN_AGE) {
            throw new NotValidAgeException();
        } else {
            usersList.add(user);
        }
        return user;
    }

    @Override
    public User update(User user) {
        if (user.getFirstName().length() < Constants.MIN_NAME_LENGTH | user.getLastName().length() < Constants.MIN_NAME_LENGTH) {
            throw new NotValidNameException();
        } else if (user.getAge() < Constants.MIN_AGE) {
            throw new NotValidAgeException();
        } else {
            usersList.set(user.getId() - 1, user);
        }
        return user;
    }

    @Override
    public User get(int id) {
        return usersList.get(id - 1);
    }

    @Override
    public List<User> getAll() {
        return usersList;
    }

    @Override
    public void remove(User user) {
        if (!usersList.contains(user)) {
            throw new NotFoundUserException();
        } else {
            usersList.remove(user);
        }
    }
}
