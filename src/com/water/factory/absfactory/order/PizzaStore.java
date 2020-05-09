package com.water.factory.absfactory.order;

//抽象方法工厰和簡單工廠的再次升華
//可以使用工廠族
public class PizzaStore {
    public static void main(String[] args) {
        //new PizzaOrder(new LDPizzaFactory());
        new PizzaOrder(new BJPizzaFactory());
    }
}
