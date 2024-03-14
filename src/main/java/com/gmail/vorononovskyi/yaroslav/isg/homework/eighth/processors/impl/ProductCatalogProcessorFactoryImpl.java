package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogProcessorFactory;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.ConsoleReader;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.Constants;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductCatalogProcessorFactoryImpl implements ProductCatalogProcessorFactory {

    private final Map<String, ProductCatalogActionProcessor> processorMap;

    public ProductCatalogProcessorFactoryImpl(List<ProductCatalogActionProcessor> productCatalogActionProcessorList) {
        processorMap = productCatalogActionProcessorList.stream()
                .collect(Collectors.toMap(ProductCatalogActionProcessor::getSupportedActionTitle, Function.identity()));
    }

    @Override
    public ProductCatalogActionProcessor getProcessorByAction(String title) {
        ProductCatalogActionProcessor productCatalogActionProcessor = null;
        while (productCatalogActionProcessor == null) {
            productCatalogActionProcessor = processorMap.get(title);
            if (productCatalogActionProcessor == null) {
                System.out.println(Constants.WRONG_TITLE_ERROR);
                System.out.println("[menu] Enter action processor (add, list, edit, remove, search, count, exit):");
                title = ConsoleReader.getStringFromConsole("Enter the correct title");
            }
        }
        return productCatalogActionProcessor;
    }
}
