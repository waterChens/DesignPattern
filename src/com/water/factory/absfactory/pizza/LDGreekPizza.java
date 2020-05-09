package com.water.factory.absfactory.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的greek");
        System.out.println("倫敦准备pizza的greek");
    }
}
