package com.water.factory.absfactory.order;

import com.water.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder {
    AbsFactory factory;

    public PizzaOrder(AbsFactory factory) {
        this.factory = factory;
        do {
            Pizza pizza = factory.createPizza(getType());
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
