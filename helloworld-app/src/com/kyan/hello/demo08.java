package com.kyan.hello;

import java.util.Random;
import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        String id;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input id " + i);
            id = sc.nextLine();
            arr[i] = id;
        }
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = r.nextInt(arr.length);
            String temp2 = arr[temp];
            arr[temp] = arr[i];
            arr[i] = temp2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
