package com.kyan.hello;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        System.out.println(num(sc.nextInt()));
    }
    public static String num(int n) {
        String rs;
        if (n % 2 == 0){
            rs = "even number";
        }else{
            rs = "odd number";
        }
        return rs;
    }
}
