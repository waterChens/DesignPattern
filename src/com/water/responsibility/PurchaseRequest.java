package com.water.responsibility;

import java.util.UUID;

public class PurchaseRequest {
    String id;
    float price;


    public PurchaseRequest(float price) {
        this.id = UUID.randomUUID().toString();
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
