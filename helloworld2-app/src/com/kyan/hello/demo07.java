package com.kyan.hello;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        score(8);
    }

    public static int[] score(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("0-100,int");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > 100 || a < 0) {
                System.out.println("0-100,int");
                i--;
            }
            arr[i] = a;
        }
        return arr;
    }

    public static int score() {
        int[] arr = score(8);
        int max = 0;
        int min = 101;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max + min;
    };

    public static int zzz() {
        int i = score();
        score(n);

    }
}
