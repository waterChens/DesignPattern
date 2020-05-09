package com.water.factory.absfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("倫敦的cheese");
        System.out.println("倫敦准备pizza的cheese");
    }
}
