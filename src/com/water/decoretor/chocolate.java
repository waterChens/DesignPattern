package com.water.decoretor;

public class chocolate extends Decorator {
    public chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
