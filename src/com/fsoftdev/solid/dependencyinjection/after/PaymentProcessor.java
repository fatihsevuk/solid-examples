package com.fsoftdev.solid.dependencyinjection.after;

public class PaymentProcessor {

    private ProductRepo repo;

    public PaymentProcessor(ProductRepo repo) {
        this.repo=repo;
    }

    public void pay(String productId){
        Product product=repo.getById(productId);
        this.processPayment(product);

    }

    public void  processPayment(Product product) {
        // process payment logic...
    }



}
