package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception;

public class NotValidNameException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Not valid name, length should be > 2";
    }
}
