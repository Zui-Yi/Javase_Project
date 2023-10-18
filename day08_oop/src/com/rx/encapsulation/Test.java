package com.rx.encapsulation;

//封装的设计规范：合理隐藏，合理暴露
public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        //s1.score无法调用，因为是private
        s1.setScore(30);
        double data=s1.getScore();
        System.out.println(data);
        s1.printPass();
    }
}
