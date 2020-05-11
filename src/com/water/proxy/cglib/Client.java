package com.water.proxy.cglib;

public class Client {
    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);
        TeacherDao teacherProxyInstance = (TeacherDao) factory.getProxyInstance();
        teacherProxyInstance.teach();teacherProxyInstance.sayHello("kkkkkk");
    }
}
