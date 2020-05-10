package com.water.bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("打开vivo手机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("关闭vivo手机");
    }
}
