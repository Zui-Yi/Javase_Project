package com.rx.javabean;

//实体类的书写要求、特点、应用场景:
//只含有get/set方法和构造器，其他数据处理方法另创建类编写

//1、必须私有成员变量，并为每个成员添加get/set方法
//2、必须为类提供一个公开的无参构造器，若添加有参时，需手动加无参构造器
//3、数据与数据业务处理相分离，放入不同类中

public class Student {
    //构造完私有成员变量后，右键点击generate快速产生get/set等方法
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
