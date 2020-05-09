package com.water.singleton.type8;

/*
    使用枚举的方式构成单例   推荐使用
    推荐使用
    不仅能够多线程同步问题，还能解决反序列化重新创建新对象的问题
 */
public class SingletonType8 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println(instance1==instance2);
        System.out.println("instance2 = " + instance2.getOk());
    }
}

enum Singleton{
    INSTANCE;
    public String getOk(){
        return "ok.......";
    }
}
