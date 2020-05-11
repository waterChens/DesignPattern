package com.water.state;

public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {

        System.out.println("奖品已发完请下次参加");
    }

    @Override
    public boolean raffle() {

        System.out.println("奖品已发完请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {

        System.out.println("奖品已发完请下次参加");
    }
}
