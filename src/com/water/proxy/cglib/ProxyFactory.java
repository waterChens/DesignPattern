package com.water.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//通过cglib代理实现
public class ProxyFactory implements MethodInterceptor {
    private Object target;
    public ProxyFactory(Object tt) {
        target = tt;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(TeacherDao.class);
        Object o = enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("进入cglib方法");
        method.invoke(target,args);
        System.out.println("cglib方法结束");
        return null;
    }
}
