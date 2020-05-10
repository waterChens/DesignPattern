package com.water.strategy;

public class BadFly implements FlyBehavior {
    @Override
    public void fly() {

        System.out.println("飞翔技术很差");
    }
}
