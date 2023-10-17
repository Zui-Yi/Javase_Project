package com.rx.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        printHelloWorld(3);

        System.out.println("--------------");

        printHelloWorld(5);
    }

    public static void printHelloWorld(int j){
        for (int i=0;i<j;i++) {
            System.out.println("Hello World");
        }

    }
}
