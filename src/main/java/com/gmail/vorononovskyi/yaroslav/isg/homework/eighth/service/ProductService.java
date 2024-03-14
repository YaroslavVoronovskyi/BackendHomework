package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    void save(Product product);

    void update(Product product);

    void delete(Product product);

    int getProductCount();

    List<Product> getProductsByQuery(String query);
}
