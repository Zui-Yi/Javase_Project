package com.rx.random;

import java.util.Random;

public class RamNum {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            int data = r.nextInt(10);//区间为[0-9)
            System.out.println(data);
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= 5; i++) {
            int data = r.nextInt(12) + 40;//区间为[40-51)
            //int data = r.nextInt(40,52) ;//区间为[40-51)
            System.out.println(data);
        }
    }
}
