package com.rx.parameter;

//基本类型的参数传递，本质是在栈内存中创建同一数据副本
public class ParaDemo1 {
    public static void main(String[] args) {
        int a=10;
        change(a);
        System.out.println("main:"+a);
    }

    public static void change(int a){
        System.out.println("change1:"+a);
        a=20;
        System.out.println("change2:"+a);
    }

}
