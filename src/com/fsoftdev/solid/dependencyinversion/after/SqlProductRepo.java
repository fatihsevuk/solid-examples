package com.fsoftdev.solid.dependencyinversion.after;

public class SqlProductRepo implements ProductRepo {

    @Override
    public Product getById(String productId) {
        // get Product from SqlDB
        return null;
    }
}
