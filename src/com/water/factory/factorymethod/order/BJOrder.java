package com.water.factory.factorymethod.order;

import com.water.factory.factorymethod.pizza.*;

public class BJOrder extends Order {
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
