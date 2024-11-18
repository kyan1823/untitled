package com.kyan.hello;

public class demo09 {
    public static void main(String[] args) {
        System.out.println(test(5));
    }
    public static boolean test(int a) {
        for (int i = 0; i < a; i++) {
        System.out.println("hello world");
        }
        return true;
    }
}
