package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.service;

import com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    User update(User user);

    User get(int id);

    List<User> getAll();

    void remove(User user);
}
