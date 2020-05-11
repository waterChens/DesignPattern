package com.water.flyweight;

public class SourceCode {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(24);
        Integer y = new Integer(24);
        //value of   是一个享元模式
        //降低内存使用 在-128 到127的范围内要比new Integer效率高
        Integer z = Integer.valueOf(24);
        Integer y1 = new Integer(24);

        System.out.println(x.equals(y));
        System.out.println(x==y);
        System.out.println(x==z);

    }
}
