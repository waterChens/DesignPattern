package com.water.singleton.type7;

/*
    //静态内部类实现单例  推荐使用
    //  1静态内部类在类加载的时候是不会加载的，只有使用的过程中才会加载
    //  2静态内部类加载过程是线程安全的
 */
public class SingletonType7 {

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
    private static class SingletonClass{
        private static final Singleton INSTANCE =new Singleton();
    }

    public static synchronized Singleton getInstance(){

        return SingletonClass.INSTANCE;
    }
}
