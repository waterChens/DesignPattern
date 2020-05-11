package com.water.state;
//当前状态为发放奖品
public class DispenseState implements State {

    //初始化时引入，发放奖品之后改变其状态
    RaffleActivity activity;
    public DispenseState(RaffleActivity raffleActivity) {

        activity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣除过积分了");

    }

    @Override
    public boolean raffle() {

        System.out.println("发放奖品状态了，不能抽奖了");
        return false;
    }

    @Override
    public void dispensePrize() {

        if (activity.getCount()>0){
            System.out.println("恭喜你中奖了额");
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾奖品送完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
