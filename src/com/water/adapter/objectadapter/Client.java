package com.water.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.phoneCharging(new VoltageAdapter(new Voltage220v()));
    }
}
