package com.water.bridge;

public abstract class Phone {

    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }
}
