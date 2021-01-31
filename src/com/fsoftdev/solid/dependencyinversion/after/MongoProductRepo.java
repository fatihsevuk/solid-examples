package com.fsoftdev.solid.dependencyinversion.after;

public class MongoProductRepo implements ProductRepo {

    @Override
    public Product getById(String productId) {
        // get Product from MongoDB
        return new Product();
    }
}
