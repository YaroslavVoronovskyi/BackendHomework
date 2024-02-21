package com.gmail.vorononovskyi.yaroslav.isg.homework.fourth;

import com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.impl.CustomArrayList;
import com.gmail.vorononovskyi.yaroslav.isg.homework.fourth.service.impl.CustomLinkedList;

public class App {
    public static void main(String[] args) {

        CustomArrayList<String> arrayList =
                CustomArrayList.of("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh");
        System.out.println(arrayList);
        arrayList.add("Eighth");
        System.out.println(arrayList);
        arrayList.add(6, "Ninth");
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.get(6));
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.contains("Ninth"));
        arrayList.set(8, "Last");
        System.out.println(arrayList);
        arrayList.remove(6);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        System.out.println("--------------------------------------------------------------------------");

        CustomLinkedList<String> linkedList =
                CustomLinkedList.of("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh");
        System.out.println(linkedList);
        linkedList.add("Eighth");
        System.out.println(linkedList);
        linkedList.add(6, "Ninth");
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.get(6));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.contains("Ninth"));
        linkedList.set(8, "Last");
        System.out.println(linkedList);
        linkedList.remove(6);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }
}
