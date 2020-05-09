package com.water.builder.improve;

//抽象的建造者
public abstract class HouseBuilder {

    House house = new House();
    public abstract void buildBasic();

    public abstract void builderWall();

    public abstract void roofer();

    public House getHouse() {
        return house;
    }
}
