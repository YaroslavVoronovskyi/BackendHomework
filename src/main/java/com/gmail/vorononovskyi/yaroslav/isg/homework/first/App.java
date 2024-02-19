package com.gmail.vorononovskyi.yaroslav.isg.homework.first;

import com.gmail.vorononovskyi.yaroslav.isg.homework.first.model.ElectronicGood;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.model.Laptop;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.model.SmartPhone;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.model.TV;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.service.IElectronicGoodService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.first.service.impl.ElectronicGoodService;

public class App {
    public static void main(String[] args) {
        IElectronicGoodService electronicGoodService = new ElectronicGoodService();
        electronicGoodService.addToBasket(new ElectronicGood[]{
                new SmartPhone(1, "IPhone 15", 1300, "silver", "China", 12345678),
                new SmartPhone(2, "IPhone 15 Pro", 1500, "graphite", "China", 12345623),
                new SmartPhone(3, "Samsung", 1300, "silver", "China", 123467),
                new SmartPhone(4, "Nokia", 500, "graphite", "China", 1654609),
                new Laptop(5, "MacBook Air 13", 1300, "silver", "China", 123456234),
                new Laptop(6, "MacBook Pro 14", 2000, "graphite", "China", 1232343),
                new Laptop(7, "MacBook Pro 16", 2500, "silver", "China", 1212367),
                new Laptop(8, "Dell", 1000, "graphite", "China", 16123609),
                new TV(9, "Samsung", 1300, "silver", "China", 12345678),
                new TV(10, "LG", 1500, "graphite", "China", 12345623),
                new TV(11, "Philips", 1300, "silver", "China", 123467),
                new TV(12, "Samsung", 500, "graphite", "China", 1654609),
        });
    }
}
