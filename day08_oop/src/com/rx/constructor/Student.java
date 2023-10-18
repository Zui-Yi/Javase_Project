package com.rx.constructor;

//构造器:创建对象时，用于初始化赋值
//类在设计时，如果不写构造器，Java会自动为类生成一个无参构造器
//一旦写了有参构造器，Java就不会生成无参构造器，也就无法无参调用了
//建议在写了有参构造器后自己写个无参构造器
public class Student {
    String name;
    Double score;

    public Student(){
        System.out.println("无参数构造器执行");
    }

    public Student(String name,Double score){
        System.out.println("有参数构造器执行");
        this.name=name;
        this.score=score;
    }

}
