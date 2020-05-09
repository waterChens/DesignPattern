package com.water.prototype.deepclone;

public class Client {
    public static void main(String[] args) {
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("消炎",9,"dff");
        DeepClone deepClone = new DeepClone("你好",0,deepCloneTarget);
//        DeepClone clone2 = (DeepClone) deepClone.clone();
        DeepClone clone2 = (DeepClone) deepClone.deepClone();
        System.out.println("deepClone = " + deepClone+"deepclone      "+deepClone.deepCloneTarget.hashCode());
        System.out.println("clone2 = " + clone2+"deepclone      "+clone2.deepCloneTarget.hashCode());
    }
}
