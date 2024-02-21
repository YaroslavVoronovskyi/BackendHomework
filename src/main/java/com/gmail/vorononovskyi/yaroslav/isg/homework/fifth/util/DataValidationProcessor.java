package com.gmail.vorononovskyi.yaroslav.isg.homework.fifth.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataValidationProcessor {

    private DataValidationProcessor() {
    }

    public static void validate(Object object) throws IllegalArgumentException {
        List<Class<? extends Annotation>> annotations = List.of(DataValidation.class);
        Class<?> targetClass = object.getClass();
        Field[] declaredFields = targetClass.getDeclaredFields();
        for (Field field : declaredFields) {
            List<? extends Class<? extends Annotation>> targetAnnotations = getTargetAnnotations(annotations, field);
            targetAnnotations.forEach(element -> {
                field.setAccessible(true);
                String typeName = element.getSimpleName();
                Object fieldValue = getObject(object, field);
                handle(field, typeName, fieldValue);
            });
        }
    }

    private static void handle(Field field, String typeName, Object fieldValue) {
        if (typeName.equals("DataValidation")) {
            DataValidation dataValidation = field.getAnnotation(DataValidation.class);
            int min = dataValidation.min();
            int max = dataValidation.max();
            try {
                if (!(fieldValue.toString().length() >= min && fieldValue.toString().length() <= max)) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException exception) {
                System.out.printf("First name, last name should be in the range of min %d and max %d%n%n", min, max);
            }

        }
    }

    private static List<? extends Class<? extends Annotation>> getTargetAnnotations(List<Class<? extends Annotation>> annotations, Field field) {
        return Arrays.stream(field.getAnnotations())
                .map(Annotation::annotationType)
                .filter(annotations::contains)
                .collect(Collectors.toList());
    }

    private static Object getObject(Object object, Field field) {
        Object fieldValue;
        try {
            fieldValue = field.get(object);
        } catch (IllegalArgumentException | IllegalAccessException exception) {
            throw new RuntimeException(exception);
        }
        return fieldValue;
    }
}
