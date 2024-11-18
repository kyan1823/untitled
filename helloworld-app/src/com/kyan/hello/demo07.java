package com.kyan.hello;

import java.util.Random;

public class demo07 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int r = rand.nextInt(100) + 1;
            arr[i] = r;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------------");
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
