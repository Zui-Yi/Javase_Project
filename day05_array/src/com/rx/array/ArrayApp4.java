package com.rx.array;

public class ArrayApp4 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            //int,char...默认值为0，float/double为0.0，boolean为false，引用类型如String为null
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 12 * (i + 1);
            System.out.println(arr[i]);
        }
    }
}
