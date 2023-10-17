package com.rx.random;

import java.util.Random;
import java.util.Scanner;

public class RamGame {
    public static void main(String[] args) {
        System.out.println("猜数游戏开始啦!");
        System.out.println("---------------");
        Random r=new Random();
        int data=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入您猜的数字:");
            int guess=sc.nextInt();
            if(guess==data){
                System.out.println("恭喜!猜数成功!");
                break;
            }else {
                if(guess<data){
                    System.out.println("猜错啦!您猜的数字偏小啦!");
                }else {
                    System.out.println("猜错啦!您猜的数字偏大啦!");
                }
            }
        }
    }
}
