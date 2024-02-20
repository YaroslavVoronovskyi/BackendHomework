package com.gmail.vorononovskyi.yaroslav.isg.homework.third;

import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.ISortService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl.BubbleSort;
import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl.InsertionSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] arrayForInsertSort = {23, 324, 234, 5, 1, 89, 66, 43, -12, 0, 11, -45, -109, 56};
        ISortService insertSort = new InsertionSort();
        System.out.println("Array before InsertSort " + Arrays.toString(arrayForInsertSort));
        insertSort.sort(arrayForInsertSort);
        System.out.println("Array after InsertSort " + Arrays.toString(arrayForInsertSort));

        System.out.println("------------------------------------------------------------------------------------");

        int[] arrayForBubbleSort = {23, 324, 234, 5, 1, 89, 66, 43, -12, 0, 11, -45, -109, 56};
        ISortService bubbleSort = new BubbleSort();
        System.out.println("Array before BubbleSort " + Arrays.toString(arrayForBubbleSort));
        bubbleSort.sort(arrayForBubbleSort);
        System.out.println("Array after BubbleSort " + Arrays.toString(arrayForBubbleSort));
    }
}
