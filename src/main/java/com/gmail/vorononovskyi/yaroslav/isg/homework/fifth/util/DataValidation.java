package com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DataValidation {

    int min();

    int max();
}
