package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.repository.ProductRepository;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public int getProductCount() {
        return productRepository.getProductCount();
    }

    @Override
    public List<Product> getProductsByQuery(String query) {
        return productRepository.getProductsByQuery(query);
    }
}
