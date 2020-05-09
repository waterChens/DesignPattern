package com.water.factory.absfactory.order;

import com.water.factory.absfactory.pizza.Pizza;

//一個抽象工廠的抽象層
public interface AbsFactory {
    Pizza createPizza(String type);
}
