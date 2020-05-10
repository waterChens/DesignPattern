package com.water.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {
                System.out.println("重写接口中的方法");
            }
        };
        absAdapter.method1();
    }
}
