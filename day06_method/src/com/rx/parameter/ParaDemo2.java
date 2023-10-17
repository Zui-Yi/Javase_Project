package com.rx.parameter;

//引用类型的参数传递，本质是地址在栈内存中创建副本后，共同指向存储此引用数据的堆内存地址
public class ParaDemo2 {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30};
        change(arr);
        System.out.println("main："+arr[1]);

    }

    public static void change(int[] arr){
        System.out.println("方法内1："+arr[1]);
        arr[1]=222;
        System.out.println("方法内2："+arr[1]);
    }

}
