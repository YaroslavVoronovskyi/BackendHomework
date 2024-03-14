package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.ConsoleReader;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.Constants;

import java.util.List;

public class ShowProductListActionProcessorImpl implements ProductCatalogActionProcessor {

    private final ProductService productService;

    public ShowProductListActionProcessorImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean doAction() {
        List<Product> productList = productService.getAll();
        if (productList.isEmpty()) {
            System.out.println("No products to show!");
            return true;
        }
        int index = Constants.FIRST_INDEX;
        for (Product product : productList) {
            index++;
            System.out.println(index + Constants.DOT_SEPARATOR + Constants.DELIMITER + product.toString());
        }
        int productNumber = ConsoleReader.getIntFromConsole("Select a product number: ", index);
        System.out.println(productList.get(productNumber - Constants.EXTRA_INDEX));
        return true;
    }

    @Override
    public String getSupportedActionTitle() {
        return "list";
    }
}
