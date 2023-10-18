package com.rx.thisdemo;

public class Student {
    double score;

    public void printThis(){
        System.out.println(this);//this为该对象在堆内存中的地址
    }

    //this作用1：解决变量名冲突问题
    public void printPass(double score){
        if(this.score>score){
            System.out.println("恭喜！被录取！");
        }
    }
}
