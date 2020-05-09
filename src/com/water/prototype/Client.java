package com.water.prototype;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",3,"白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        System.out.println("sheep5 = " + sheep5);
        System.out.println("sheep4 = " + sheep4);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep1 = " + sheep1);
    }
}
