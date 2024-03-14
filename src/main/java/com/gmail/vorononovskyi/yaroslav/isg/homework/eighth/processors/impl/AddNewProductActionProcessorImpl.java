package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.ConsoleReader;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.Constants;

public class AddNewProductActionProcessorImpl implements ProductCatalogActionProcessor {

    private final ProductService productService;

    public AddNewProductActionProcessorImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean doAction() {
        String name = ConsoleReader.getStringFromConsole("Enter the name of the product:",
                Constants.NAME_CHECK_PATTERN, Constants.WRONG_NAME_FORMAT_ERROR);
        String color = ConsoleReader.getStringFromConsole("Enter the color of the product:",
                Constants.COLOR_CHECK_PATTERN, Constants.WRONG_COLOR_FORMAT_ERROR);
        String price = ConsoleReader.getStringFromConsole("Enter the price of the product: ",
                Constants.PRICE_CHECK_PATTERN, Constants.WRONG_PRICE_FORMAT_ERROR);
        productService.save(new Product(name, color, price));
        System.out.println("The product added.");
        System.out.println();
        return true;
    }

    @Override
    public String getSupportedActionTitle() {
        return "add";
    }
}
