package com.water.factory.simplefactory.order;

import com.water.factory.simplefactory.pizza.CheesePizza;
import com.water.factory.simplefactory.pizza.GreekPizza;
import com.water.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder {

    public PizzaOrder(){
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

    }

    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
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
