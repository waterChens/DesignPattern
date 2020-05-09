package com.water.builder.improve;

public class HouseDirector {
    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.builderWall();
        houseBuilder.roofer();
        return houseBuilder.getHouse();
    }
}
