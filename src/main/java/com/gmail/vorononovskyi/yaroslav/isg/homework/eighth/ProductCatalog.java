package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogProcessorFactory;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util.ConsoleReader;

public class ProductCatalog {

    private final ProductCatalogProcessorFactory processorFactory;

    public ProductCatalog(ProductCatalogProcessorFactory processorFactory) {
        this.processorFactory = processorFactory;
    }

    public void runProductCatalog() {
        try {
            boolean needContinue = true;
            while (needContinue) {
                String actionTitle = ConsoleReader.getStringFromConsole(
                        "[menu] Enter action processor (add, list, remove, search, count, exit):");
                ProductCatalogActionProcessor processor = processorFactory.getProcessorByAction(actionTitle);
                needContinue = processor.doAction();
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
