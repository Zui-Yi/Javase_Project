package com.rx.test;

//输出九九乘法表

public class Test3 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
