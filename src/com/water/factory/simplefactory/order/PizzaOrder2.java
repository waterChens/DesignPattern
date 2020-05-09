package com.water.factory.simplefactory.order;

import com.water.factory.simplefactory.pizza.Pizza;
import com.water.factory.simplefactory.pizza.SimplePizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaOrder2 {


    public PizzaOrder2() {

        do {

            Pizza pizza = SimplePizzaFactory.createPizza2(getType());
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
