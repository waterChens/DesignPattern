package com.water.state;

public interface State {

    //扣除积分
    void deduceMoney();

    //抽奖
    boolean raffle();

    //领取奖品
    void dispensePrize();
}
