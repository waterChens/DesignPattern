package com.water.singleton;


/*
runtime 就是典型的饿汉式单例模式的应用
 */
public class Test {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println("runtime1.hashCode() = " + runtime1.hashCode());
    }
}
