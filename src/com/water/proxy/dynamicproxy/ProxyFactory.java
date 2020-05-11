package com.water.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//根据传入的目标对象
//利用反射机制，返回代理对象
//然后通过代理对象，调用方法
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object tt) {
        target = tt;
    }

    public Object getProxyInstance() {
        /*
         1.classloader 指定目标对象的类加载器
         2.interfaces 目标对象的接口类型
         3.invocationhandler 事件处理；执行目标对象的方法时，会触发事情处理器方法，会把目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始jdk代理");
                Object invokeObj = method.invoke(target, args);
                System.out.println("jdk代理方法结束");
                return invokeObj;
            }
        });
    }
}
