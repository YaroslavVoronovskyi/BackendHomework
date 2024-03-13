package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh;

import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model.Customer;
import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model.Good;
import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model.Warehouse;
import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service.GoodService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service.impl.GoodServiceImpl;

import java.util.concurrent.ConcurrentLinkedQueue;

public class App {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<Good> goodsQueue = new ConcurrentLinkedQueue<>();
        goodsQueue.add(new Good("Cup", "white", 2));
        goodsQueue.add(new Good("Cup", "blue", 2));
        goodsQueue.add(new Good("Cup", "green", 2));
        goodsQueue.add(new Good("Cup", "black", 2));
        goodsQueue.add(new Good("Cup", "silver", 2));
        goodsQueue.add(new Good("Cup", "red", 2));
        goodsQueue.add(new Good("Cup", "brown", 2));
        goodsQueue.add(new Good("Cup", "yellow", 2));
        goodsQueue.add(new Good("Cup", "orange", 2));
        goodsQueue.add(new Good("Cup", "pink", 2));

        goodsQueue.add(new Good("Plate", "white", 3));
        goodsQueue.add(new Good("Plate", "blue", 3));
        goodsQueue.add(new Good("Plate", "green", 3));
        goodsQueue.add(new Good("Plate", "black", 3));
        goodsQueue.add(new Good("Plate", "silver", 3));
        goodsQueue.add(new Good("Plate", "red", 3));
        goodsQueue.add(new Good("Plate", "brown", 3));
        goodsQueue.add(new Good("Plate", "yellow", 3));
        goodsQueue.add(new Good("Plate", "orange", 3));
        goodsQueue.add(new Good("Plate", "pink", 3));

        goodsQueue.add(new Good("Bowl", "white", 2));
        goodsQueue.add(new Good("Bowl", "blue", 2));
        goodsQueue.add(new Good("Bowl", "green", 2));
        goodsQueue.add(new Good("Bowl", "black", 2));
        goodsQueue.add(new Good("Bowl", "silver", 2));
        goodsQueue.add(new Good("Bowl", "red", 2));
        goodsQueue.add(new Good("Bowl", "brown", 2));
        goodsQueue.add(new Good("Bowl", "yellow", 2));
        goodsQueue.add(new Good("Bowl", "orange", 2));
        goodsQueue.add(new Good("Bowl", "pink", 2));

        goodsQueue.add(new Good("Cup", "white", 2));
        goodsQueue.add(new Good("Cup", "blue", 2));
        goodsQueue.add(new Good("Cup", "green", 2));
        goodsQueue.add(new Good("Cup", "black", 2));
        goodsQueue.add(new Good("Cup", "silver", 2));
        goodsQueue.add(new Good("Cup", "red", 2));
        goodsQueue.add(new Good("Cup", "brown", 2));
        goodsQueue.add(new Good("Cup", "yellow", 2));
        goodsQueue.add(new Good("Cup", "orange", 2));
        goodsQueue.add(new Good("Cup", "pink", 2));

        goodsQueue.add(new Good("Plate", "white", 3));
        goodsQueue.add(new Good("Plate", "blue", 3));
        goodsQueue.add(new Good("Plate", "green", 3));
        goodsQueue.add(new Good("Plate", "black", 3));
        goodsQueue.add(new Good("Plate", "silver", 3));
        goodsQueue.add(new Good("Plate", "red", 3));
        goodsQueue.add(new Good("Plate", "brown", 3));
        goodsQueue.add(new Good("Plate", "yellow", 3));
        goodsQueue.add(new Good("Plate", "orange", 3));
        goodsQueue.add(new Good("Plate", "pink", 3));

        goodsQueue.add(new Good("Bowl", "white", 2));
        goodsQueue.add(new Good("Bowl", "blue", 2));
        goodsQueue.add(new Good("Bowl", "green", 2));
        goodsQueue.add(new Good("Bowl", "black", 2));
        goodsQueue.add(new Good("Bowl", "silver", 2));
        goodsQueue.add(new Good("Bowl", "red", 2));
        goodsQueue.add(new Good("Bowl", "brown", 2));
        goodsQueue.add(new Good("Bowl", "yellow", 2));
        goodsQueue.add(new Good("Bowl", "orange", 2));
        goodsQueue.add(new Good("Bowl", "pink", 2));

        Warehouse warehouse = new Warehouse(goodsQueue);
        GoodService goodService = new GoodServiceImpl();

        Thread firstCustomer = new Thread(new Customer(warehouse, goodService));
        Thread secondCustomer = new Thread(new Customer(warehouse, goodService));
        Thread thirdCustomer = new Thread(new Customer(warehouse, goodService));

        firstCustomer.start();
        secondCustomer.start();
        thirdCustomer.start();

        try {
            firstCustomer.join();
            secondCustomer.join();
            thirdCustomer.join();
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
    }
}
