package com.water.prototype.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("使用原型模式进行复制");
        Sheep sheep = new Sheep("tom",3,"白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep4 = " + sheep4);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep1 = " + sheep1);
    }
}
