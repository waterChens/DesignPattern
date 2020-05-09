package com.water.singleton.type4;

/*
 懒汉式2
 */
public class SingletonType4 {

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

    //加入同步处理
    //但是效率低下
    //在实际开发中不推荐使用
    public static synchronized Singleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
