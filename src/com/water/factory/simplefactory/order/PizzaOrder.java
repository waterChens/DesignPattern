package com.water.factory.simplefactory.order;

import com.water.factory.simplefactory.pizza.CheesePizza;
import com.water.factory.simplefactory.pizza.GreekPizza;
import com.water.factory.simplefactory.pizza.Pizza;
import com.water.factory.simplefactory.pizza.SimplePizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder {

   /* public PizzaOrder(){
        Pizza pizza=null;
        String type = "";//披萨类型
        do {
            if ("cheese".equals(getType())){

                pizza = new CheesePizza();
                pizza.setName("cheese");
            }else if ("greek".equals(getType())){
                pizza  = new GreekPizza();
                pizza.setName("greek");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }*/

   SimplePizzaFactory simplePizzaFactory;

    public PizzaOrder(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
        do {

            Pizza pizza = simplePizzaFactory.createPizza(getType());
            if (pizza != null) {

                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入披萨类型：       ");
        String type = null;
        try {
            type = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("披萨种类type = " + type);
        return type;
    }
}
