package com.rx.test;

/*抢红包：
共5个红包，红包数额分别为9、188、520、666、99999
模拟抽取这5个红包，先到先得，随机抽取
抽奖前需要输入姓名，而后立即公布抽奖结果*/

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] money={9,188,520,666,99999};
        for (int i=0;i<money.length;i++) {
            game(money);
        }
        System.out.println("抽奖结束!");
    }
    //该方案问题：若数组过大，到后面给出中间金额可能等待很久
    //新方案：随机打乱数组，依次分配红包
    public static void game(int[] money){
        System.out.print("请输入您的姓名：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        Random rm=new Random();
        int i= rm.nextInt(money.length);
        while (money[i]==-1) {
            i= rm.nextInt(money.length);
        }
        int acq = money[i];
        System.out.println("您的中奖金额是："+acq);
        money[i]=-1;
    }

}
