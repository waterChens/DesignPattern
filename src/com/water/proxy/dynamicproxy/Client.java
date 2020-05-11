package com.water.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {

ITeacherDao teacherDao = new TeacherDao();
ProxyFactory factory = new ProxyFactory(teacherDao);
        ITeacherDao teacherProxyInstance = (ITeacherDao) factory.getProxyInstance();
        teacherProxyInstance.teach();teacherProxyInstance.sayHello("kkkkkk");
    }
}
