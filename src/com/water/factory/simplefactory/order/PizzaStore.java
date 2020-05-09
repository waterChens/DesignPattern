package com.water.factory.simplefactory.order;

import com.water.factory.simplefactory.pizza.SimplePizzaFactory;

public class PizzaStore {

    public static void main(String[] args) {
//        new PizzaOrder();
        //使用简单工厂创建对象
        new PizzaOrder(new SimplePizzaFactory());
    }
}
