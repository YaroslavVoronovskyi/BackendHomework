package com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.ISortService;

public class BubbleSort implements ISortService {

    @Override
    public void sort(int[] array) {
        int temp;
        int length = array.length;
        boolean swapped;
        for (int index = 0; index < length; index++) {
            swapped = false;
            for (int innerIndex = 0; innerIndex < length - index - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    temp = array[innerIndex];
                    array[innerIndex] = array[innerIndex + 1];
                    array[innerIndex + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
