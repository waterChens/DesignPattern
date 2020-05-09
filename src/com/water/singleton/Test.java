package com.water.singleton;

public class Test {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println("runtime1.hashCode() = " + runtime1.hashCode());
    }
}
