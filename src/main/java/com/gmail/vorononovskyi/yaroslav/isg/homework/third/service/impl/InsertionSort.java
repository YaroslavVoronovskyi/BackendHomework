package com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.third.service.ISortService;

public class InsertionSort implements ISortService {

    @Override
    public void sort(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int key = array[index];
            int innerIndex = index - 1;
            while (innerIndex >= 0 && array[innerIndex] > key) {
                array[innerIndex + 1] = array[innerIndex];
                innerIndex--;
            }
            array[innerIndex + 1] = key;
        }
    }
}
