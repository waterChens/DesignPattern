package com.water.factory.absfactory.order;


import com.water.factory.absfactory.pizza.LDCheesePizza;
import com.water.factory.absfactory.pizza.LDGreekPizza;
import com.water.factory.absfactory.pizza.Pizza;

public class LDPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null ;
        if ("cheese".equals(type)){
            pizza = new LDCheesePizza();
        }else if ("greek".equals(type)){
            pizza  = new LDGreekPizza();
        }
        return pizza;
    }
}
