package com.water.flyweight;

public class ConcreteWebsite extends WebSite {
    String type="";//网站类型     内部状态：变化可控

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void user(User user) {
        System.out.println("使用具体的网站形式为："+type+"正在使用,使用者为："+user.getName());
    }
}
