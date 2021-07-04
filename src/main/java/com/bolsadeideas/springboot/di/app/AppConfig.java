package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.di.app.models.domain.InvoiceItem;
import com.bolsadeideas.springboot.di.app.models.domain.Product;
import com.bolsadeideas.springboot.di.app.models.service.IService;
import com.bolsadeideas.springboot.di.app.models.service.MyComplexService;
import com.bolsadeideas.springboot.di.app.models.service.MyService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("MySimpleService")
    public IService regitryMyService() {
        return new MyService();
    }

    @Bean("MyComplexService")
    @Primary
    public IService regitryMyComplexService() {
        return new MyComplexService();
    }

    @Bean("invoiceItems")
    public List<InvoiceItem> registryInvoiceItems() {
        Product product1 = new Product("Camara Sony", 100);
        Product product2 = new Product("Bicileta Bianchi aro 26", 200);
        Product product3 = new Product("Impresora HP", 400);

        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 5);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 7);
        InvoiceItem invoiceItem3 = new InvoiceItem(product3, 10);

        return Arrays.asList(invoiceItem1, invoiceItem2, invoiceItem3);
    }

}
