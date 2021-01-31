package com.fsoftdev.solid.dependencyinjection.before;

public class PaymentProcessor {

    public void pay(String productId){
        SqlProductRepo repo=new SqlProductRepo();
        Product product=repo.getById(productId);
        this.processPayment(product);

    }

    public void  processPayment(Product product) {
        // process payment logic...
    }



}
