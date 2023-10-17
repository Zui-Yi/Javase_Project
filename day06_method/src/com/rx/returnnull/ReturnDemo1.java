package com.rx.returnnull;

//掌握return单独使用时的用法：在无返回值类型void中，return用于立即结束当前方法的执行

public class ReturnDemo1 {
    public static void main(String[] args) {
        chufa(10,0);
        chufa(15,3);
    }

    public static void chufa(int a,int b){
        if(b==0){
            System.out.println("您的数据有问题，不能除0");
            return;
        }
        int c=a/b;
        System.out.println(c);
    }
}
