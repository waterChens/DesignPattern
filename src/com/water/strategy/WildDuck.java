package com.water.strategy;

public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = new GoodFly();
    }
}
