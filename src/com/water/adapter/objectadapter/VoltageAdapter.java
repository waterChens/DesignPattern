package com.water.adapter.objectadapter;

// 相较于类适配器的方式更加的灵活
public class VoltageAdapter implements IVoltage5v {

    Voltage220v voltage220v;

    public VoltageAdapter(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output() {
        System.out.println("使用对象适配器的方式进行");
        int curVoltage = voltage220v.input();
        int charging = curVoltage/44;
        return charging;
    }
}
