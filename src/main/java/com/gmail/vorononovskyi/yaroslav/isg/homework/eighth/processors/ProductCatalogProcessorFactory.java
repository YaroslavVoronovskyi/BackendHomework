package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors;

public interface ProductCatalogProcessorFactory {

    ProductCatalogActionProcessor getProcessorByAction(String actionTitle);
}
