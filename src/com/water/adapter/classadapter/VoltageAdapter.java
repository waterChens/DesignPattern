package com.water.adapter.classadapter;

public class VoltageAdapter extends Voltage220v implements IVoltage5v {
    @Override
    public int output() {
        int curVoltage = input();
        int charging = curVoltage/44;
        return charging;
    }
}
