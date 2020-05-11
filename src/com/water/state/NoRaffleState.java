package com.water.state;

//不能抽奖的状态
public class NoRaffleState implements State {
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣除积分，扣除后可以抽奖
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }
    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分之后才能抽奖哦");
        return false;
    }

    //当前状态不能发奖品
    @Override
    public void dispensePrize() {

        System.out.println("不能领取奖品");
    }
}
