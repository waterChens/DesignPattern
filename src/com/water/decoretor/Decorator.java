package com.water.decoretor;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return this.price+obj.cost();
    }

    @Override
    public String getDes() {
        return des+"价格："+getPrice()+"      "+obj.getDes();
    }
}
