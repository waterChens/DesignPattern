package com.water.state;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {

        System.out.println("扣积分环节-----------奖品已发完请下次参加");
    }

    @Override
    public boolean raffle() {

        System.out.println("抽奖环节-------奖品已发完请下次参加");
        System.exit(0);
        return false;
    }

    @Override
    public void dispensePrize() {

        System.out.println("发放奖品环节-----------奖品已发完请下次参加");
    }
}
