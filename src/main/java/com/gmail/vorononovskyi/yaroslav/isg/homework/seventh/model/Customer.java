package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model;

import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service.GoodService;

public class Customer implements Runnable {

    private final Warehouse warehouse;
    private final GoodService goodService;

    public Customer(Warehouse warehouse, GoodService goodService) {
        this.warehouse = warehouse;
        this.goodService = goodService;
    }

    @Override
    public void run() {
        goodService.buyGood(warehouse.getGoodsQueue());
    }
}
