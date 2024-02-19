package com.gmail.vorononovskyi.yaroslav.isg.homework.third;

import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.ISortService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl.BubbleSort;
import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl.InsertionSort;

public class App {
    public static void main(String[] args) {

        int[] arrayForInsertSort = {23, 324, 234, 5, 1, 89, 66, 43, -12, 0, 11, -45, -109, 56};
        ISortService insertSort = new InsertionSort();
        insertSort.sort(arrayForInsertSort);

        for (Integer value : arrayForInsertSort) {
            System.out.println(value);
        }

        System.out.println("-------");

        int[] arrayForBubbleSort = {23, 324, 234, 5, 1, 89, 66, 43, -12, 0, 11, -45, -109, 56};
        ISortService bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayForBubbleSort);

        for (Integer value : arrayForBubbleSort) {
            System.out.println(value);
        }
    }
}
