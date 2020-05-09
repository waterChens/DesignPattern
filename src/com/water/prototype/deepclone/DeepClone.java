package com.water.prototype.deepclone;

import java.io.*;

public class DeepClone implements Cloneable ,Serializable{

    String name;
    int age;
    DeepCloneTarget deepCloneTarget;

    public DeepClone(String name, int age, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.age = age;
        this.deepCloneTarget = deepCloneTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deepCloneTarget=" + deepCloneTarget +
                '}';
    }

    //方式1  使用递归拷贝的方式
    @Override
    protected Object clone() {
        DeepClone sheep = null;
        try {
            sheep = (DeepClone) super.clone();
            DeepCloneTarget deepCloneTarget1 = (DeepCloneTarget) this.deepCloneTarget.clone();
            sheep.deepCloneTarget =deepCloneTarget1;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
    //深拷贝方式2   通过对象序列化实现（推荐）
    public Object deepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //把对象写进输出流

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClone o = (DeepClone)ois.readObject();//A把对象从流中读出来
            return o;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
return null;

    }

}
