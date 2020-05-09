package com.water.factory.absfactory.order;

import com.water.factory.absfactory.pizza.BJCheesePizza;
import com.water.factory.absfactory.pizza.BJGreekPizza;
import com.water.factory.absfactory.pizza.Pizza;

public class BJPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null ;
        if ("cheese".equals(type)){
            pizza = new BJCheesePizza();
        }else if ("greek".equals(type)){
            pizza  = new BJGreekPizza();
        }
        return pizza;
    }
}
