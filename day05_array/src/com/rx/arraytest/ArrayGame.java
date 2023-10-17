package com.rx.arraytest;

public class ArrayGame {
    public static void main(String[] args) {
        int[] scores = {15, 9000, 20000, 8500, -5};
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println(max);
    }
}
