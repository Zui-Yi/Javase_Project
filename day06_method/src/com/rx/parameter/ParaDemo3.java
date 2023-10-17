package com.rx.parameter;

public class ParaDemo3 {
    public static void main(String[] args) {

        int[] arr2=null; //arr2不指向堆内元素，本身不存地址，故数组无长度
        int[] arr3={}; //arr3指向堆内存，存放数组在堆内存的首地址，存储的数据为空，故数组长度为0

        System.out.println(arr2);
        if(arr2==null){
            System.out.println("无长度");}else{
            System.out.println(arr2.length);
        }
        System.out.println(arr3);
        if(arr3==null){
            System.out.println("无长度");}else{
            System.out.println(arr3.length);
        }
    }
}
