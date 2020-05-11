package com.water.flyweight;

import java.util.HashMap;

public class WebsiteFactory {

    HashMap<String,WebSite> pool  =new HashMap<String,WebSite>();

    public WebSite getWebsite(String type){
        if (!pool.containsKey(type)) {

            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }
}
