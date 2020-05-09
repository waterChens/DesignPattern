package com.water.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {

        System.out.println("打地基50米");
    }

    @Override
    public void builderWall() {
        System.out.println("砌墙100");
    }

    @Override
    public void roofer() {
        System.out.println("封顶");
    }
}
