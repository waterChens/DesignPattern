package com.water.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {

        System.out.println("正在授课。。。。。。。。");
    }
}
