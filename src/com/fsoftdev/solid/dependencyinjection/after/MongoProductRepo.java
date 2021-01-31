package com.fsoftdev.solid.dependencyinjection.after;

public class MongoProductRepo implements ProductRepo {

    @Override
    public Product getById(String productId) {
        // get Product from MongoDB
        return new Product();
    }
}
