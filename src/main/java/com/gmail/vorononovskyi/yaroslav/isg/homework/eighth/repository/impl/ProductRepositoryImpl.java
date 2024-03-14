package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.repository.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> productCatalog = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return productCatalog;
    }

    @Override
    public void save(Product product) {
        productCatalog.add(product);
    }

    @Override
    public void update(Product product) {
        removeByCondition(product);
        productCatalog.add(product);
    }

    @Override
    public void delete(Product product) {
        removeByCondition(product);
    }

    @Override
    public int getProductCount() {
        return productCatalog.size();
    }

    @Override
    public List<Product> getProductsByQuery(String query) {
        List<Product> resultList = new ArrayList<>();
        for (Product product : productCatalog) {
            if (product.matches(query)) {
                resultList.add(product);
            }
        }
        return resultList;
    }

    private void removeByCondition(Product product) {
        productCatalog.removeIf(item -> item.getId().equals(product.getId()));
    }
}
