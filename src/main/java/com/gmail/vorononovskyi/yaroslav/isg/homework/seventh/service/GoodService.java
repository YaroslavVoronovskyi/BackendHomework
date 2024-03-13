package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.service;

import com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model.Good;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface GoodService {

     void buyGood(ConcurrentLinkedQueue<Good> goodsQueue);
}
