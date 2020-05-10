package com.water.decoretor;

public class Client {
    public static void main(String[] args) {
        Drink order = new Longblack();
        System.out.println(order.getDes());
        System.out.println(order.cost());
         order = new Milk(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());
         order = new chocolate(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());
    }
}
