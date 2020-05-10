package com.water.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.phoneCharging(new VoltageAdapter());

    }
}
