package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception;

public class NotFoundUserException extends RuntimeException {
    @Override
    public String getMessage() {
        return "User not found";
    }
}
