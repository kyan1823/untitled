package com.kyan.hello;

public class demo03 {
    public static void main(String[] args) {
        String[] arr = {"qwe","12", "asdf"};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void printArray(String[] arr){
        if (arr == null) {
            System.out.println(arr);
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                break;
            }
            System.out.print(", ");
        }
        System.out.print("]");
    }

}
