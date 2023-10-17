package com.rx.overload;

//方法重载指的是一个类中，出现多个方法的名称相同，但形参不同
//名称相同（只关心名称，不关心修饰符或返回值），形参不同（形参的个数，类型，顺序不同）

public class OverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(5);
        test(2.0);
        test(2.0,3);
    }

    public static void test(){
        System.out.println("---test1---");
    }
    public static void test(int a){
        System.out.println("---test2---"+a);
    }
    static void test(double a){
        System.out.println("---test3---"+a);
    }
    static int test(double a,int b){
        System.out.println(a+b);
        return (int)a+b;
    }
    //void test(int a){}  //名称相同，形参相同，报错，不算重载
}