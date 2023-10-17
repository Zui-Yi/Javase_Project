package com.rx.define;

public class MethodDemo1 {
    public static void main(String[] args) {

        //张三自己写
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("和是" + c);

        //李四直接调用方法
        int c1 = sum(10, 20);
        System.out.println("和是" + c1);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
