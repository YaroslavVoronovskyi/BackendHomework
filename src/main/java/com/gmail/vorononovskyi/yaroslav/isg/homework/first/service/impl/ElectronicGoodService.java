package com.gmail.vorononovskyi.yaroslav.isg.homework.first.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.first.model.ElectronicGood;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.service.IElectronicGoodService;

public class ElectronicGoodService implements IElectronicGoodService {

    @Override
    public void addToBasket(ElectronicGood[] electronicGoodsArray) {
        double totalSum = 0;
        for (ElectronicGood good : electronicGoodsArray) {
            totalSum += good.getPrice();
        }
        System.out.println("Total sum = " + totalSum + " $");
    }
}
