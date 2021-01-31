package com.fsoftdev.solid.dependencyinversion.after;

public class PaymentProcessor {

    public void pay(String productId){
        ProductRepo repo= ProductRepoFactory.create("sql");
        Product product=repo.getById(productId);
        this.processPayment(product);

    }

    public void  processPayment(Product product) {
        // process payment logic...
    }



}
