package com.rx.array;

public class ArrayApp2 {
    public static void main(String[] args) {
        int[] arr={12,24,36};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0]=55;
        arr[2]=70;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);
    }
}
