package com.water.state;

import java.util.Random;

public class CanRaffleState implements State {
    RaffleActivity activity;
    public CanRaffleState(RaffleActivity raffleActivity) {
        activity = raffleActivity;
    }

    //已经扣过积分了，当前状态不能再扣积分了
    @Override
    public void deduceMoney() {
        System.out.println("已经扣过积分了");
    }
   //可以抽奖，根据实际情况改成新状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽个奖，请稍等");

        Random random = new Random();
        int anInt = random.nextInt(10);
        if (anInt==1){

            activity.setState(activity.getDispenseState());
            return true;
        }else {

            System.out.println("很遗憾没中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {

        System.out.println("没有中奖，不能发放奖品");
    }
}
