package com.water.singleton.type3;

/*
 懒汉式
 */
public class SingletonType3 {

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

    
    public static Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
