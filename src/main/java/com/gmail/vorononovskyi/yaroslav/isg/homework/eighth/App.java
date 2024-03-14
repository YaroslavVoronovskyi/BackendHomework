package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth;

import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogActionProcessor;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.ProductCatalogProcessorFactory;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.AddNewProductActionProcessorImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.CountProductActionProcessorImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.ProductCatalogProcessorFactoryImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.RemoveProductActionProcessorImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.SearchProductActionProcessorImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.processors.impl.ShowProductListActionProcessorImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.repository.ProductRepository;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.repository.impl.ProductRepositoryImpl;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.ProductService;
import com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.service.impl.ProductServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepositoryImpl();

        ProductService productService = new ProductServiceImpl(productRepository);

        ProductCatalogActionProcessor addNewProductProcessor = new AddNewProductActionProcessorImpl(productService);
        ProductCatalogActionProcessor countProductProcessor = new CountProductActionProcessorImpl(productService);
        ProductCatalogActionProcessor removeProductProcessor = new RemoveProductActionProcessorImpl(productService);
        ProductCatalogActionProcessor searchProductProcessor = new SearchProductActionProcessorImpl(productService);
        ProductCatalogActionProcessor showProductProcessor = new ShowProductListActionProcessorImpl(productService);

        ProductCatalogProcessorFactory productCatalogProcessorFactory =
                new ProductCatalogProcessorFactoryImpl(List.of(addNewProductProcessor, countProductProcessor,
                        removeProductProcessor, searchProductProcessor, showProductProcessor));

        ProductCatalog productCatalog = new ProductCatalog(productCatalogProcessorFactory);
        productCatalog.runProductCatalog();
    }
}
