package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;

public class ExitApplicationActionProcessor implements ProductCatalogActionProcessor {

    @Override
    public boolean doAction() {
        return false;
    }

    @Override
    public String getSupportedActionTitle() {
        return "exit";
    }
}
