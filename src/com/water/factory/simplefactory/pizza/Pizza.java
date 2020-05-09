package com.water.factory.simplefactory.pizza;

public abstract class Pizza {

    String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("name = " + name+"       baking; ,......");
    }

    public void cut() {


        System.out.println("name = " + name+"    cuting; ,......");
    }

    public void box() {

        System.out.println("name = " + name+"         boxing; ,......");
    }

    public void setName(String name) {
        this.name = name;
    }
}
