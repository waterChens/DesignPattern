package com.water.flyweight;

public class Clients {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        WebSite site = factory.getWebsite("博客");
        site.user(new User("lisi"));
        WebSite site1= factory.getWebsite("新闻");
        site1.user(new User("王五"));
        WebSite site2 = factory.getWebsite("新闻");
        site2.user(new User("zhaoliu"));
        System.out.println("网站数量"+factory.pool.size());
    }
}
