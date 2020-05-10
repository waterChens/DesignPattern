package com.water.strategy;

public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术很好");
    }
}
