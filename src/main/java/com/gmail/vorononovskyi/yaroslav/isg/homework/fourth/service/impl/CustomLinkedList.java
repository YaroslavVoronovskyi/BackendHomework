package com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.ICustomList;

import java.util.NoSuchElementException;
import java.util.Objects;

public class CustomLinkedList<Type> implements ICustomList<Type> {

    static class CustomNode<Type> {
        Type element;
        CustomNode<Type> next;

        public CustomNode(Type element) {
            this.element = element;
        }
    }

    private CustomNode<Type> firstElement;
    private CustomNode<Type> lastElement;
    private int size;

    public static <Type> CustomLinkedList<Type> of(Type... elements) {
        CustomLinkedList<Type> linkedList = new CustomLinkedList<>();
        for (Type element : elements) {
            linkedList.add(element);
        }
        return linkedList;
    }

    @Override
    public void add(Type element) {
        CustomNode<Type> newNode = new CustomNode<>(element);
        if (size == 0) {
            firstElement = lastElement = newNode;
        } else {
            lastElement.next = newNode;
            lastElement = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, Type element) {
        Objects.checkIndex(index, size + 1);
        CustomNode<Type> newNode = new CustomNode<>(element);
        if (size == 0) {
            firstElement = lastElement = newNode;
        } else if (index == 0) {
            newNode.next = firstElement;
            firstElement = newNode;
        } else if (index == size) {
            lastElement.next = newNode;
            lastElement = newNode;
        } else {
            CustomNode<Type> previous = getNodeByIndex(index - 1);
            newNode.next = previous.next;
            previous.next = newNode;
        }
        size++;
    }

    private CustomNode<Type> getNodeByIndex(int index) {
        CustomNode<Type> current = firstElement;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void set(int index, Type element) {
        Objects.checkIndex(index, size);
        CustomNode<Type> node = getNodeByIndex(index);
        node.element = element;
    }

    @Override
    public Type get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
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
    public Type remove(int index) {
        Objects.checkIndex(index, size);
        Type removedElement;
        if (index == 0) {
            removedElement = firstElement.element;
            firstElement = firstElement.next;
            if (firstElement == null) {
                lastElement = null;
            }
        } else {
            CustomNode<Type> previous = getNodeByIndex(index - 1);
            removedElement = previous.next.element;
            previous.next = previous.next.next;
            if (index == size - 1) {
                lastElement = previous;
            }
        }
        size--;
        return removedElement;
    }

    @Override
    public boolean contains(Type element) {
        CustomNode<Type> current = firstElement;
        for (int index = 0; index < size; index++) {
            if (current.element.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (firstElement == null) {
            return "[]";
        } else {
            builder.append(firstElement.element);
            CustomNode<Type> current = firstElement.next;
            while (current != null) {
                builder.append(", ")
                        .append(current.element);
                current = current.next;
            }
            return "[" + builder + "]";
        }
    }
}
