package com.rx.arraytest;

import java.util.Random;
import java.util.Scanner;

public class ArrayGame3 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入员工工号：");
            arr[i]=sc.nextInt();
        }
        System.out.print("初始数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            Random rm=new Random();
            int j= rm.nextInt(0,5);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println();
        System.out.print("随机数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
