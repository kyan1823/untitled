package com.kyan.hello;

import java.util.Scanner;

public class demo05 {

    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("input the score" + i);
            int j = sc.nextInt();
            array[i] = j;
            sum += array[i];
        }
        System.out.println(sum);
        int average = sum / array.length;
        System.out.println(average);
        System.out.println("------------");
    }
}
