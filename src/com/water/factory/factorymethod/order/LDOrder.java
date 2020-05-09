package com.water.factory.factorymethod.order;

import com.water.factory.factorymethod.pizza.LDCheesePizza;
import com.water.factory.factorymethod.pizza.LDGreekPizza;
import com.water.factory.factorymethod.pizza.Pizza;

public class LDOrder extends Order {
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
