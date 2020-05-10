package com.water.composite;

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级的大学");
        OrganizationComponent colleage1 = new Colleage("计算机学院", "计算机学院");
        OrganizationComponent colleage2 = new Colleage("信息工程学院", "信息工程学院");
        OrganizationComponent department = new Department("软件工程", "计算机学院");
        OrganizationComponent department1 = new Department("网络工程", "计算机学院");
        OrganizationComponent department2 = new Department("信息工程", "信息工程学院");
        OrganizationComponent department3 = new Department("通讯工程", "信息工程学院");
        university.add(colleage1);
        university.add(colleage2);
        colleage1.add(department);
        colleage1.add(department1);
        colleage2.add(department2);
        colleage2.add(department3);
        //university.print();
        colleage2.print();


    }
}
