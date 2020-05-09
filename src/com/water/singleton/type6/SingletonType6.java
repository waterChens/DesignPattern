package com.water.singleton.type6;

/*
    //双重检查  推荐使用
    //延时加载
 */
public class SingletonType6 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println(instance1==instance2);
    }
}

class Singleton{
    private Singleton() {
    }
    private static Singleton INSTANCE ;

    //双重检查
    //保证效率的同时的懒汉式加载
    public static synchronized Singleton getInstance(){
        if (INSTANCE == null) {
            synchronized (Singleton.class){
                if (INSTANCE == null) {

                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
