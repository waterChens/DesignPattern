package com.water.factory.simplefactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨做准备");
    }
}
