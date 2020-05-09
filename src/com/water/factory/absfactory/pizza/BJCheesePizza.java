package com.water.factory.absfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的cheesepisa");
        System.out.println("北京准备pizza的cheese");
    }
}
