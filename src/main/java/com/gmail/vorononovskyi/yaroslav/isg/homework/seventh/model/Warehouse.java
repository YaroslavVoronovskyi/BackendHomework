package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Warehouse {

    private final ConcurrentLinkedQueue<Good> goodsQueue;

    public Warehouse(ConcurrentLinkedQueue<Good> goodsQueue) {
        this.goodsQueue = goodsQueue;
    }

    public ConcurrentLinkedQueue<Good> getGoodsQueue() {
        return goodsQueue;
    }
}
