package com.water.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基5米");
    }

    @Override
    public void builderWall() {
        System.out.println("砌墙8米");
    }

    @Override
    public void roofer() {
        System.out.println("封顶");
    }
}
