package com.fsoftdev.solid.dependencyinjection.after;

public class ProductRepoFactory {

    public static ProductRepo create(String type) {

        if(type.equals("mongo")) {
            return new MongoProductRepo();
        }

        return new SqlProductRepo();
    }
}
