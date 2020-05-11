package com.water.proxy.staticproxy;


//静态代理  代理
//与目标类实现同样的接口
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;//目标接口， 通过接口聚合

    public TeacherDaoProxy(ITeacherDao teacherDao) {

        target = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始，完成某些操作");
        target.teach();
        System.out.println("提交");

    }
}
