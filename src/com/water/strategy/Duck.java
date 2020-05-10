package com.water.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    public void  fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
