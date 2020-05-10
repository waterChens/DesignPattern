package com.water.adapter.classadapter;

public class Phone {


    public void phoneCharging(IVoltage5v v){
        if (v.output()==5){
            System.out.println("电压为5v可以充电 = " + v.output());
        }else {

            System.out.println("不能充电");
        }
    }
}
