package com.kyan.hello;

import java.util.Scanner;

public class kyan01 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入a");
        a = sc.nextInt();
        System.out.println("输入b");
        b = sc.nextInt();
        boolean c = a > 3 ^ b < 5;
        System.out.println(c);
        int n = a - b;
        String m = n > 0 ? "true" : "false";
        System.out.println(m);
    }
}
