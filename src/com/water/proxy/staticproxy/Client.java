package com.water.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理类去执行被代理类的方法
        teacherDaoProxy.teach();
    }
}
