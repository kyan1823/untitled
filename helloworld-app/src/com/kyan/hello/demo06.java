package com.kyan.hello;

import java.util.Random;

public class demo06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        //创建数组
        for (int i = 0; i <arr.length; i++) {
            int r = rand.nextInt(100) + 1;
            arr[i] = r;
        }
        //用随机数给数组赋值
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //输出数组
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //找出最大的数
        System.out.println("----");
        System.out.println(max);
    }
}
