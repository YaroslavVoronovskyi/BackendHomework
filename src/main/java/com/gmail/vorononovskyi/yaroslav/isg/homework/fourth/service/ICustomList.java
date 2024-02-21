package com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service;

public interface ICustomList<Type> {

    void add(Type element);

    void add(int index, Type element);

    void set(int index, Type element);

    Type get(int index);

    Type getFirst();

    Type getLast();

    Type remove(int index);

    boolean contains(Type element);

    boolean isEmpty();

    int size();

    void clear();
}
