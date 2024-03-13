package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model.Good;
import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service.GoodService;

import java.util.concurrent.ConcurrentLinkedQueue;

public class GoodServiceImpl implements GoodService {

    @Override
    public synchronized void buyGood(ConcurrentLinkedQueue<Good> goodsQueue) {
        ConcurrentLinkedQueue<Good> extraGoodsList = addExtraGoodsQueue();
        for (Good good : goodsQueue) {
            goodsQueue.poll();
            System.out.println(good);
            transaction();
            if (goodsQueue.size() < (100 * 20) / 100) {
                System.out.println("The sale is temporarily suspended, we are waiting for new products");
                stopSale();
                System.out.println("Sale is started!");
                goodsQueue.addAll(extraGoodsList);
            }
        }
        System.out.println("No more any goods!");
    }

    private void transaction() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }

    private void stopSale() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }

    private ConcurrentLinkedQueue<Good> addExtraGoodsQueue() {
        ConcurrentLinkedQueue<Good> extraGoodsQueue = new ConcurrentLinkedQueue<>();
        extraGoodsQueue.add(new Good("Cup", "white", 2));
        extraGoodsQueue.add(new Good("Cup", "blue", 2));
        extraGoodsQueue.add(new Good("Cup", "green", 2));
        extraGoodsQueue.add(new Good("Cup", "black", 2));
        extraGoodsQueue.add(new Good("Cup", "silver", 2));
        extraGoodsQueue.add(new Good("Cup", "red", 2));
        extraGoodsQueue.add(new Good("Cup", "brown", 2));
        extraGoodsQueue.add(new Good("Cup", "yellow", 2));
        extraGoodsQueue.add(new Good("Cup", "orange", 2));
        extraGoodsQueue.add(new Good("Cup", "pink", 2));

        extraGoodsQueue.add(new Good("Plate", "white", 3));
        extraGoodsQueue.add(new Good("Plate", "blue", 3));
        extraGoodsQueue.add(new Good("Plate", "green", 3));
        extraGoodsQueue.add(new Good("Plate", "black", 3));
        extraGoodsQueue.add(new Good("Plate", "silver", 3));
        extraGoodsQueue.add(new Good("Plate", "red", 3));
        extraGoodsQueue.add(new Good("Plate", "brown", 3));
        extraGoodsQueue.add(new Good("Plate", "yellow", 3));
        extraGoodsQueue.add(new Good("Plate", "orange", 3));
        extraGoodsQueue.add(new Good("Plate", "pink", 3));

        extraGoodsQueue.add(new Good("Bowl", "white", 2));
        extraGoodsQueue.add(new Good("Bowl", "blue", 2));
        extraGoodsQueue.add(new Good("Bowl", "green", 2));
        extraGoodsQueue.add(new Good("Bowl", "black", 2));
        extraGoodsQueue.add(new Good("Bowl", "silver", 2));
        extraGoodsQueue.add(new Good("Bowl", "red", 2));
        extraGoodsQueue.add(new Good("Bowl", "brown", 2));
        extraGoodsQueue.add(new Good("Bowl", "yellow", 2));
        extraGoodsQueue.add(new Good("Bowl", "orange", 2));
        extraGoodsQueue.add(new Good("Bowl", "pink", 2));

        extraGoodsQueue.add(new Good("Cup", "white", 2));
        extraGoodsQueue.add(new Good("Cup", "blue", 2));
        extraGoodsQueue.add(new Good("Cup", "green", 2));
        extraGoodsQueue.add(new Good("Cup", "black", 2));
        extraGoodsQueue.add(new Good("Cup", "silver", 2));
        extraGoodsQueue.add(new Good("Cup", "red", 2));
        extraGoodsQueue.add(new Good("Cup", "brown", 2));
        extraGoodsQueue.add(new Good("Cup", "yellow", 2));
        extraGoodsQueue.add(new Good("Cup", "orange", 2));
        extraGoodsQueue.add(new Good("Cup", "pink", 2));

        extraGoodsQueue.add(new Good("Plate", "white", 3));
        extraGoodsQueue.add(new Good("Plate", "blue", 3));
        extraGoodsQueue.add(new Good("Plate", "green", 3));
        extraGoodsQueue.add(new Good("Plate", "black", 3));
        extraGoodsQueue.add(new Good("Plate", "silver", 3));
        extraGoodsQueue.add(new Good("Plate", "red", 3));
        extraGoodsQueue.add(new Good("Plate", "brown", 3));
        extraGoodsQueue.add(new Good("Plate", "yellow", 3));
        extraGoodsQueue.add(new Good("Plate", "orange", 3));
        extraGoodsQueue.add(new Good("Plate", "pink", 3));

        extraGoodsQueue.add(new Good("Bowl", "white", 2));
        extraGoodsQueue.add(new Good("Bowl", "blue", 2));
        extraGoodsQueue.add(new Good("Bowl", "green", 2));
        extraGoodsQueue.add(new Good("Bowl", "black", 2));
        extraGoodsQueue.add(new Good("Bowl", "silver", 2));
        extraGoodsQueue.add(new Good("Bowl", "red", 2));
        extraGoodsQueue.add(new Good("Bowl", "brown", 2));
        extraGoodsQueue.add(new Good("Bowl", "yellow", 2));
        extraGoodsQueue.add(new Good("Bowl", "orange", 2));
        extraGoodsQueue.add(new Good("Bowl", "pink", 2));
        return extraGoodsQueue;
    }

    public ConcurrentLinkedQueue<Good> addToBucket(Good good) {
        ConcurrentLinkedQueue<Good> queue = new ConcurrentLinkedQueue<>();
        queue.add(good);
        return queue;
    }
}
