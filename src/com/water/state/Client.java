package com.water.state;

public class Client {

    public static void main(String[] args) {

        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i <30 ; i++) {
            //第一步减去积分
            activity.deductMoney();
            //第二步抽奖
            activity.raffle();
        }
    }
}
