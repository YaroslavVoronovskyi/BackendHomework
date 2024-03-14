package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;

public class CountProductActionProcessorImpl implements ProductCatalogActionProcessor {

    private final ProductService productService;

    public CountProductActionProcessorImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean doAction() {
        System.out.println("The Product Catalog has " + productService.getProductCount() + " products.");
        return true;
    }

    @Override
    public String getSupportedActionTitle() {
        return "count";
    }
}
