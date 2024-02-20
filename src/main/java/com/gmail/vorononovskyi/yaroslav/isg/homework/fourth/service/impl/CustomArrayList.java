package com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.ICustomList;

import java.util.NoSuchElementException;
import java.util.Objects;

public class CustomArrayList<Type> implements ICustomList<Type> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size;

    public CustomArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }

    public CustomArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public static <Type> CustomArrayList<Type> of(Type... elements) {
        CustomArrayList<Type> arrayList = new CustomArrayList<>();
        for (Type element : elements) {
            arrayList.add(element);
        }
        return arrayList;
    }

    @Override
    public void add(Type element) {
        resize();
        elements[size] = element;
        size++;

    }

    @Override
    public void add(int index, Type element) {
        Objects.checkIndex(index, size + 1);
        resize();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public void set(int index, Type element) {
        Objects.checkIndex(index, size);
        elements[index] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Type get(int index) {
        Objects.checkIndex(index, size);
        return (Type) elements[index];
    }

    @Override
    public Type getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    @Override
    public Type getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Type remove(int index) {
        Objects.checkIndex(index, size);
        Type removedElement = (Type) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removedElement;
    }

    @Override
    public boolean contains(Type element) {
        for (int index = 0; index < size; index++) {
            if (element.equals(elements[index])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void resize() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (elements == null) {
            return "[]";
        } else {
            for (int index = 0; index < size; index++) {
                builder.append(elements[index].toString());
                if (index != size - 1) builder.append(", ");
            }
            return "[" + builder + "]";
        }
    }
}
