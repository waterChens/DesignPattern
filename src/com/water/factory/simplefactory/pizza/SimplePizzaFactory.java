package com.water.factory.simplefactory.pizza;

/*
简单工厂模式
 */
public class SimplePizzaFactory {

    public Pizza createPizza( String type) {
        Pizza pizza = null;

            if ("cheese".equals(type)){

                pizza = new CheesePizza();
                pizza.setName("cheese");
            }else if ("greek".equals(type)){
                pizza  = new GreekPizza();
                pizza.setName("greek");
            }else {
                System.out.println("程序退出");
            }
            return pizza;
    }
}
