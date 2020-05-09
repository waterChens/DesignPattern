package com.water.factory.factorymethod.order;

//使用抽象方法創建工廠類
public class PizzaStore {

    public static void main(String[] args) {
        //輪動的各種口味的pizza
        //new LDOrder();
        //北京的各種口味的pizza
        new BJOrder();
    }
}
