package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model.Product;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.ConsoleReader;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.Constants;

import java.util.List;

public class SearchProductActionProcessorImpl implements ProductCatalogActionProcessor {

    private final ProductService productService;

    public SearchProductActionProcessorImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean doAction() {
        String query = ConsoleReader.getStringFromConsole("Enter search query: ",
                Constants.SEARCH_QUERY_CHECK_PATTERN, Constants.WRONG_SEARCH_QUERY_FORMAT_ERROR);
        List<Product> productList = productService.getProductsByQuery(query);
        System.out.println("Found " + productList.size() + " results:");
        if (productList.isEmpty()) {
            System.out.println("No products to show!");
            return true;
        }
        int index = Constants.FIRST_INDEX;
        for (Product product : productList) {
            index++;
            System.out.println(index + Constants.DOT_SEPARATOR + Constants.DELIMITER + product.toString());
        }

        int productNumber = ConsoleReader.getIntFromConsole("Select a product: ", index);
        System.out.println(productList.get(productNumber - Constants.EXTRA_INDEX));
        return true;
    }

    @Override
    public String getSupportedActionTitle() {
        return "search";
    }
}
