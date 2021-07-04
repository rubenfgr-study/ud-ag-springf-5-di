package com.bolsadeideas.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope
// @ApplicationScope
// @SessionScope
public class Invoice implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;

    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<InvoiceItem> items;

    @PostConstruct
    public void init() {
        client.setFirstName("Juan");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Factura destruida");
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<InvoiceItem> getItems() {
        return this.items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

}
