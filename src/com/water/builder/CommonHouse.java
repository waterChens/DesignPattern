package com.water.builder;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {

        System.out.println("普通房子建造地基");
    }

    @Override
    public void builderWall() {


        System.out.println("普通房子注墙");
    }

    @Override
    public void roofer() {

        System.out.println("普通房子封顶");
    }
}
