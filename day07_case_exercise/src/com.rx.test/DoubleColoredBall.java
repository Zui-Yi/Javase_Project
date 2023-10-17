package com.rx.test;

/*双色球系统：
* 1.用户投注一组号码，6红1蓝(红=1-33，蓝=1-16)
* 2.系统生成一组号码，6红1蓝
* 3.核对用户是否中奖，返回奖金
* */

import java.util.Random;
import java.util.Scanner;

public class DoubleColoredBall {
    public static void main(String[] args) {
        price(setNum(),createNum());
    }

    public static int[] setNum(){
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[7];
        System.out.println("请输入您想投注的前6个红球号码：");
        for (int i = 0; i < arr1.length-1; i++) {
            int temp=sc.nextInt();
            while (true) {
                if(temp>33||temp<1){
                    System.out.println("投注号码不合法,请重新投注此号码：");
                    temp=sc.nextInt();
                    continue;
                }else {
                    arr1[i]=temp;
                    break;
                }
            }
        }
        System.out.println("请输入您想投注的1个蓝球号码：");
        int temp= sc.nextInt();
        while (true) {
            if(temp>16||temp<1){
                System.out.println("投注号码不合法,请重新投注此号码：");
                temp=sc.nextInt();
                continue;
            }else {
                arr1[arr1.length-1]=temp;
                break;
            }
        }
        System.out.print("您的投注号码为：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        return arr1;
    }

    public static int[] createNum(){
        Random rm=new Random();
        int[] truenum=new int[7];
        for (int i = 0; i < truenum.length-1; i++) {
            int temp=rm.nextInt(1,34);
            truenum[i]=temp;
        }
        int temp= rm.nextInt(1,17);
        truenum[truenum.length-1]=temp;
        System.out.println();
        System.out.print("中奖号码为：");
        for (int i = 0; i < truenum.length; i++) {
            System.out.print(truenum[i]+" ");
        }
        return truenum;
    }

    public static void price(int[] test,int[] exist) {
        if(test==null){
            System.out.println();
            System.out.println("此次投注无效，请重新投注！");
            return;
        }
        int red = 0;
        int blue = 0;
        for (int i = 0; i < test.length - 1; i++) {
            for (int j = 0; j < exist.length - 1; j++) {
                if (test[i] == exist[j]) {
                    red++;
                    exist[j] = -1;
                    break;
                }
            }
        }
        if (test[test.length - 1] == exist[exist.length - 1]) {
            blue++;
        }
        System.out.println();
        System.out.println("红球中奖数目："+red);
        System.out.println("蓝球中奖数目："+blue);
        switch (red) {
            case 0:
                System.out.println("很遗憾，您没有中奖");
                break;
            case 1:
            case 2:
                if (blue == 0) {
                    System.out.println("很遗憾，您没有中奖");
                } else {
                    System.out.println("恭喜！您中奖5元！");
                }
                break;
            case 3:
                if (blue == 0) {
                    System.out.println("很遗憾，您没有中奖");
                } else {
                    System.out.println("恭喜！您中奖10元！");
                }
                break;
            case 4:
                if (blue == 0) {
                    System.out.println("恭喜！您中奖10元！");
                } else {
                    System.out.println("恭喜！您中奖200元！");
                }
                break;
            case 5:
                if (blue == 0) {
                    System.out.println("恭喜！您中奖200元！");
                } else {
                    System.out.println("恭喜！您中奖3000元！");
                }
                break;
            case 6:
                if (blue == 0) {
                    System.out.println("恭喜！您中奖5000000元！");
                } else {
                    System.out.println("恭喜！您中奖10000000元！");
                }
                break;
        }
    }
}
