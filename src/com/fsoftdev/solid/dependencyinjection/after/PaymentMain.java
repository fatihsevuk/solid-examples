package com.fsoftdev.solid.dependencyinjection.after;

public class PaymentMain {
    public static void main(String[] args) {
        ProductRepo repo=ProductRepoFactory.create("sql");
        PaymentProcessor processor=new PaymentProcessor(repo);
        processor.pay("123");
    }
}
