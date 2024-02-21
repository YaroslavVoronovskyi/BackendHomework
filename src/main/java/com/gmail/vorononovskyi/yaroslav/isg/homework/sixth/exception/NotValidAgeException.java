package com.gmail.vorononovskyi.yaroslav.isg.homework.sixth.exception;

public class NotValidAgeException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Not valid age, should be > 18 years";
    }
}
