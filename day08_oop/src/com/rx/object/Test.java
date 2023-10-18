package com.rx.object;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="张三";
        s1.chinese=90;
        s1.math=96;
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2=new Student();
        s2.name="李四";
        s2.chinese=86;
        s2.math=94;
        s2.printTotalScore();
        s2.printAverageScore();

        System.out.println(s1);
        System.out.println(s2);
    }
}
