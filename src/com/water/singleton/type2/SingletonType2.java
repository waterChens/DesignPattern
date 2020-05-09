package com.water.singleton.type2;

/*
 饿汉式
 */
public class SingletonType2 {

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
    private static  Singleton INSTANCE ;

    static {
        INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
