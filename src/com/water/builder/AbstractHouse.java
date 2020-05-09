package com.water.builder;

public abstract class AbstractHouse {
    public abstract void buildBasic();

    public abstract void builderWall();

    public abstract void roofer();

    public void builder() {
        buildBasic();
        builderWall();
        roofer();
    }
}
