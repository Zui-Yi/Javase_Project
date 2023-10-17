package com.rx.test;

//找素数：判断指定范围内有多少素数，并输出所有素数

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入待检测数据起始边界：");
        int a= sc.nextInt();
        System.out.print("请输入待检测数据结束边界：");
        int b= sc.nextInt();
        find(a,b);
    }

    public static void find(int a,int b){
        if(a>b){
            System.out.println("数据范围输入错误!");
            return;
        }
        int num=0;
        for (int i=a;i<=b;i++){
            int flag=1;
            for(int j=2;j<i/2+1;j++){
                if(i%j==0) {
                    flag=0;
                    break;
                }
            }
            if (flag==1) {
                num+=1;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("素数总数为："+num);
    }

}
