package com.rx.videodemo;

//电影信息系统：
//1、展示系统中的全部电影（每部电影展示名称、价格）
//2、允许用户通过电影编号id查询某个电影的详细信息
//1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看"
//2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看"
//3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看"
//4,"一点就到家",35,8.7,"徐宏宇","刘昊然","10.8万人想看"

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Video[] videos=new Video[4];
        videos[0]=new Video(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        videos[1]=new Video(2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看");
        videos[2]=new Video(3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看");
        videos[3]=new Video(4,"一点就到家",35,8.7,"徐宏宇","刘昊然","10.8万人想看");

        Operator op=new Operator(videos);

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("-----电影信息系统-----");
            System.out.println("1、查询所有电影信息");
            System.out.println("2、根据id查询该电影详细信息");
            System.out.println("3、退出系统");
            int command=sc.nextInt();
            if(command==3){
                System.out.println("成功退出系统！");
                break;
            }
            switch (command){
                case 1:
                    op.showAllVideo();
                    break;
                case 2:
                    System.out.println("请输入您想查询的电影id：");
                    int idd=sc.nextInt();
                    op.searchVideoById(idd);
                    break;
                default:
                    System.out.println("命令错误！");
            }
        }

    }
}
