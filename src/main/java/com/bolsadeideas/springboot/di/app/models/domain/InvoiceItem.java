package com.bolsadeideas.springboot.di.app.models.domain;

public class InvoiceItem {

    private Product product;
    private Integer quantity;

    public InvoiceItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer calculateTotal() {
        return this.quantity * this.product.getPrice();
    }

}
