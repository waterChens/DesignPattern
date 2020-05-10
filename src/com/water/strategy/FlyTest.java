package com.water.strategy;

public class FlyTest {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.setFlyBehavior(new NoFly());
        wildDuck.fly();
    }
}
