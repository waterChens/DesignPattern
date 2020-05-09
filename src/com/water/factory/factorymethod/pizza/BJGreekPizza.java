package com.water.factory.factorymethod.pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的greek");
        System.out.println("北京准备pizza的greek");
    }
}
