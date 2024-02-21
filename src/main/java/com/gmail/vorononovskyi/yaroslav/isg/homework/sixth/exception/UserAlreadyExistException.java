package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception;

public class UserAlreadyExistException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User already exist";
    }
}
