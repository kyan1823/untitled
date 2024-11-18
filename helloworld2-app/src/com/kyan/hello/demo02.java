package com.kyan.hello;

public class demo02 {
    public static void main(String[] args) {
        int[] arr = {12, 32, 24, 27};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(getarr(i, arr) + ",");
        }
        System.out.println("]");
    }
    public static int getarr(int i,int[] array) {
        return array[i];
        }
    }

