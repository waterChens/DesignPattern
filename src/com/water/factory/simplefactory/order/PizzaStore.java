package com.water.factory.simplefactory.order;

import com.water.factory.simplefactory.pizza.SimplePizzaFactory;

public class PizzaStore {

    public static void main(String[] args) {
//        new PizzaOrder();
        //使用简单工厂创建对象
//        new PizzaOrder(new SimplePizzaFactory());
        //使用靜態的方法創建的對象
        new PizzaOrder2();
    }
}
