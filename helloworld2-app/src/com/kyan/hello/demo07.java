package com.kyan.hello;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        System.out.println(score(6,100,0));
    }

    public static int score(int n, int max, int min) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("between " + min + " and " + max);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > max || a < min) {
                System.out.println("between " + min + " and " + max);
                return 0;
            }
            arr[i] = a;
        }
        int sum = sum(arr);
        int m = maxplusmin(arr,max,min);
        return (sum - m)/(n - 2);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxplusmin(int[] arr, int max, int min) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=  min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= max) {
                max = arr[i];
            }
        }
        return max + min;
    }
}
