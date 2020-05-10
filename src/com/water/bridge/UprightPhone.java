package com.water.bridge;

public class UprightPhone extends Phone {

    public UprightPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void call() {
        super.call();
        System.out.println("直板手机");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直板手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直板手机");
    }
}
