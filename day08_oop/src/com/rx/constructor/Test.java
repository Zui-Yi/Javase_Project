package com.rx.constructor;

public class Test {
    public static void main(String[] args) {

        //传统方法
        Student s1=new Student();
        s1.name="李四";
        s1.score=96.0;
        //构造器直接赋初值
        Student s2=new Student("张三",92.0);

        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
